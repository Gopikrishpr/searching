package searchingalgorthms;
public class ExponenetialSearch {
    public void search(int[] arr,int value,int start,int end){
        /*if(start == arr.length){
            System.out.println("Not found");
            return;
        }
        else if(end <= arr.length-1 && value > arr[end]){
            if(end >= arr.length)
                search(arr,value,end,arr.length-1);
            else
                search(arr,value,end,(int)Math.pow(2, end));
        }
        else{
            for(int i = end;i>=start;i--)
                if(value == arr[i]){
                    System.out.println("Found");
                    return;
                }    
        }*/
        while(start != arr.length-1){
            if(value > arr[end]){
                start = end;
                end = (int)Math.pow(2,end);
                if(end >= arr.length)
                    end = arr.length-1;
            }
            else
                break;
        }
        for(int i=end; i>=start;i--)
            if(value == arr[i]){
                System.out.println("found");
                return;
            }
        System.out.println("Not found");
    }
}
