class Bubble_Sort
{
  public static void main(String args[])
  {
    int temp;
    int[] a={9,5,7,4,2,6,1};
    System.out.print("\nUnsorted Array : ");
    // Printing Unsorted Array
    for(int i=0;i<a.length;i++){
      System.out.print(a[i]+" ");
    }
    // Bubble Sort
    for(int i=0;i<a.length;i++){
      for(int j=0;j<a.length-i-1;j++){
	if(a[j]>a[j+1]){
	  temp=a[j];
	  a[j]=a[j+1];
	  a[j+1]=temp;
        }
      }
    }
    System.out.print("\nSorted Array   : ");
    // Printing Sorted Array
    for(int i=0;i<a.length;i++){
      System.out.print(a[i]+" ");
    }
  }
}