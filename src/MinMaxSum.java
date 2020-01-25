import java.util.Arrays;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class MinMaxSum {
//    static void divide(int []arr){
//        if(arr.length == 1){
//            return;
//        }
//        int mid = arr.length/2;
//        int[] leftArray = new int[mid];
//        int[] rightArray = new int[arr.length - mid];
//            for(int i=0;i<mid;i++){
//                leftArray[i]= arr[i];
//            }
//            for(int i=mid,j=0;i<arr.length;i++,j++){
//                rightArray[j]= arr[i];
//            }
//            divide(leftArray);
//            divide(rightArray);
//            merge(arr, leftArray, leftArray, mid, arr.length-mid);
//    }
//    static void merge(int [] arr, int[] leftArray, int[] rightArray, int mid, int afterMid){
//        int i=0,j=0,k=0;
//        while(i< mid && j<afterMid){
//            if(leftArray[i]<rightArray[j]){
//                arr[k]=leftArray[i];
//                k++;i++;
//            }else{
//                arr[k] = rightArray[j];
//                k++;j++;
//            }
//        }
//        while(i< mid ){
//                arr[k]=leftArray[i];
//                k++;i++;
//        }
//        while(j<afterMid){
//                arr[k]=leftArray[i];
//                k++;i++;
//        }
//    }

    static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);
        int i =0,j=arr.length-1;
        long maxsum = 0, minsum=0;
        while(i<arr.length-1){
            maxsum = maxsum+arr[i];
            i++;
        }
        System.out.println("---------");
        while(j>0){
            minsum = minsum+arr[j];
            j--;
        }
        //System.out.println(minsum+" "+maxsum);

    }
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5};
        miniMaxSum(arr);
    }
}
