// Insertion Sort

class Insertion_Sort
{
  public static void main(String arg[])
  {
    System.out.print("\nUnsorted Array : ");
    int[] a={7,2,4,1,5,3,0};
    int value,idx;

    // Printing the Unsorted Array
    for(int i=0;i<a.length;i++){
      System.out.print(a[i]+" ");
    }

    // Implementing Insertion Sort
    for(int i=1;i<a.length;i++){
      value=a[i];
      idx=i;
      while(idx>0 && a[idx-1]>value){
        a[idx]=a[idx-1];
        idx--;
      }
      a[idx]=value;
    }
 
    // Printing Sorted Array
    System.out.print("\nSorted Array : ");
    for(int i=0;i<a.length;i++){
      System.out.print(a[i]+" ");
    }
  }
}


// Time Complexity : Avg & Worst Case ==> O(n^2)
//                   Best Case        ==> O(n)