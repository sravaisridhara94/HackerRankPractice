import java.util.ArrayList;
import java.util.List;


public class CompareTriplets {

    private static List<Integer> triplets(List<Integer> a, List<Integer> b){
        List<Integer> compare = new ArrayList<>();
        int c=0, d=0;
        for(int i=0;i<3;i++){
            if(a.get(i)>b.get(i)){
               c++;
            }else if(a.get(i)<b.get(i)){
                d++;
            }
        }
        compare.add(c);compare.add(d);
        return compare;
    }
    public static void main(String args[]){
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        a.add(2);a.add(30);a.add(15);
        b.add(40);b.add(10);b.add(15);
        System.out.println(triplets(a,b));
    }
}
