package searchingalgorthms;
public class JumpSearch {
    public void search(int[] arr,int value){
        
        int start = 0;
        int end = (int)Math.sqrt(arr.length);
        while(start < arr.length){
            if(value > arr[end-1]){
                start = end;
                if(end+start >= arr.length)
                   end=arr.length;
                else
                    end+=start;
            }
            else
                break;
        }
        for(int i=start;i<end && i < arr.length;i++){
            if(value == arr[i]){
                System.out.println("Found");
                return;
            }
        }
        System.out.println("Not found");
    }
}
