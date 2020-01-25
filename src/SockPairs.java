import java.util.ArrayList;
import java.util.List;

public class SockPairs {

    static int sockMerchant(int n, int[] ar) {
        List<Integer> socks = new ArrayList<>();
        int x=0;
        for(int i: ar){
            System.out.println("checking:"+i);
            if(!socks.contains(i)){
                System.out.println(i+" do not exist so added");
                socks.add(i);
            }else{
                System.out.println(i+" exists, removed");
                socks.remove(Integer.valueOf(i));
                x++;
            }
        }return x;
    }
    public static void main(String [] args){
        int arr[] ={1,1,3,1,2,1,3,3,3,3};
        int n = 10;
        System.out.println(sockMerchant(n,arr));
    }
}
