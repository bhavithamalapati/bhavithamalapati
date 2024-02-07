public class LargestNum {
    public static void main(String[] args){
        int arr[] = {1,-7,9,5,21,26,24};
        System.out.println(+findLargestNumber(arr));
    }
    static int findLargestNumber(int arr[]){
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
