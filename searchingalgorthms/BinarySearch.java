package searchingalgorthms;
public class BinarySearch extends SearchingAlgorthms{
    protected void search(int[] arr, int value,int start,int end){
        if(start > end){
            System.out.println("Not Found");
            return;
        }
        int mid = (start+end)/2;
        if(arr[mid] == value){
            System.out.println("Found");
            return;
        }
        else if(value < arr[mid])
            search(arr,value,start,mid-1);
        else
            search(arr,value,mid+1,end); 
    }
}
