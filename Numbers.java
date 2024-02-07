public class Numbers {
    public static void main(String[] args){
        int arr[] = {-1,2,3,4,-2};
        kadans(arr);
    }
    public static void kadans(int arr[]){
        int currsum = 0;
        int maxsum = 0;
        for(int i=0;i<arr.length;i++){
            currsum += arr[i];
            if(currsum < 0){
                currsum = 0;
            }
            maxsum = Math.max(maxsum,currsum);
        }
        System.out.println(maxsum);
    }
}
