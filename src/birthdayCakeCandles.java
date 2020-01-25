import java.util.Arrays;

public class birthdayCakeCandles {

    static int birthdayCakeCandle(int[] ar) {
        int maxElement = Arrays.stream(ar).max().getAsInt();
        return (int) Arrays.stream(ar).filter(x -> x == maxElement).count();
    }
    public static void main(String args[]){
        int ar[] = {2,5, 9, 1, 9};
        System.out.println(birthdayCakeCandle(ar));
    }
}
