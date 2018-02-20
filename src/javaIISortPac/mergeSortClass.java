package javaIISortPac;

import java.util.Arrays;

public class mergeSortClass
{

  private static int[] list =  {1, 2, 3, 4, 98, 99, 100, 101, 105, 77, 78, 79, 8, 9, 10};
  private static int[] list2= {1000, 900, 800, 700, 0, 1, 2, 3, 4, 75, 80, 85, 90, 95};
;
  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
    //int howMany = 10;
   // list = new int[howMany];
   /* for(int i = 0; i < list.length; i++ )
    {
      //this gives you numbers from 1 to 1000
       list[i]= (int)(Math.random() * 1000) +1;
    }*/
    
    System.out.println(Arrays.toString(list));
    
    mergeIt(4,8, 9, 11);
    
    System.out.println(Arrays.toString(list));

    //int start = 0;
    //int end = list.length -1;
    
    //mergeSort(start, end);
  }
  
  //This is the worker method that merges two sorted lists....
  public static void mergeIt(int s1, int e1, int s2, int e2)
  {
    // create a new list for a section you want to merge.....
    int[] newList = new int[e2-s1+1];
    int l1 = s1;
    int l2 = s2;
    int listElement= 0;
    
    //somehow there is a loop involved....
    while (listElement <= e2-s1)
    {
      //System.out.println("Checking: "  + list[l1]  + " and " + list[l2] );
        if(l1 <= e1 && l2 <= e2)
        {
            if( list[l1] > list[l2]) newList[listElement] = list[l2++];
            else  newList[listElement] = list[l1++]; 
        } else {
          if(l1 <= e1)  newList[listElement] = list[l1++];
          if(l2 <= e2)  newList[listElement] = list[l2++];
        }
            listElement++;         
    }
    
    //put new list of sorted numbers (the merged list back into original list...)
        for(int i = 0; i < newList.length; i++)
        {
          System.out.println("in final loop looking at " + (i + s1));
          list[i+s1] = newList[i];
        }
    
  }
  
  
  
  
  
  
  
  
  
  
 public static void mergeSort(int s, int e)
 {
   
   if(e-s > 0){
    
     System.out.println("Call Merge Sort First Half from " + s + " to " + (e/2) );
     mergeSort(s, e/2);
     if(e/2+1 < list.length)
     System.out.println("Call Merge Sort Second Half from " + ((e/2)+1)+ " to " + (e) );
     mergeSort(e/2+1, e);
   } else {
     System.out.print("STOP THE RECURSION!!!");
   }
   
   
 }
}
