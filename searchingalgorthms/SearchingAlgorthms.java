package searchingalgorthms;
import java.util.*;
public class SearchingAlgorthms {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       ExponenetialSearch s = new ExponenetialSearch();
       int n = sc.nextInt();
       int arr[] = new int[n];
       for(int i=0;i<n;i++)
           arr[i]=sc.nextInt();
       QuickSort<Integer> obj = new QuickSort();
       obj.sort(arr,0,arr.length-1);
       System.out.println(Arrays.toString(arr));
       System.out.print("Enter the number that you want to find: ");
       int searchValue = sc.nextInt();
       //s.search(arr,searchValue,0,arr.length-1);
       s.search(arr,searchValue, 0,0);
    } 
}
class QuickSort<T>{
    public void sort(int[] arr,int start,int end){
        if(start >= end)
            return;
        int boundary = partition(arr,start,end);
        sort(arr,0,boundary-1);
        sort(arr,boundary+1,end);
    }
    private int partition(int[] arr,int start, int end){
        int boundary = start-1;
        for(int i = start;i<=end;i++)
            if(arr[i] <= arr[end])
                swap(arr,i,++boundary);
        return boundary;
    }
    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
