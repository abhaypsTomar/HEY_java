import java.util.Scanner;
public class binaray_search {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        int target = in.nextInt();
        int ans = BinaraySearch(arr,target);
        System.out.println(ans);
    }
    static int BinaraySearch(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = start+ (end-start)/2;
            if(target<arr[mid]){
                end = mid -1;
            } else if (target>arr[mid]) {
                start = mid+1;
            }else{
                return mid;
            }

        }
        return -1;
    }
}
