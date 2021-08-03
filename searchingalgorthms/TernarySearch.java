package searchingalgorthms;
public class TernarySearch {
    public void search(int[] arr,int value,int start,int end){
        if(start > end){
            System.out.println("Not Found");
            return;
        }
        int partitionSize = (end - start)/3;
        int mid1 = start + partitionSize;
        int mid2 = end - partitionSize;
        if(value == arr[mid1] || value == arr[mid2]){
            System.out.println("Found");
            return;
        }
        else if(value < arr[mid1])
            search(arr,value,start,mid1-1);
        else if(value > arr[mid2])
            search(arr,value,mid2+1,end);
        else
            search(arr,value,mid1+1,mid2-1);
    }
}
