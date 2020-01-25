import java.util.ArrayList;
import java.util.List;

public class DiagnolDifference {
    private static int diag(List<List<Integer>> arr){
        int row = arr.size();
        int i =0,j=0, diag1=0, diag2=0;
        System.out.println(diag2+" :diag2");
        while(i < row){
            diag1 = diag1+ arr.get(i).get(i);
            i++;
        }
        while((j<row) && ((i-1)>=0)){
            diag2 = diag2+arr.get(j).get(i-1);
            i--;
            j++;
        }
        return Math.abs(diag1-diag2);
    }
    public static void main(String args[]){
        List<Integer> a = new ArrayList<>();
        a.add(11);
        a.add(2);
        a.add(4);
        List<Integer> b = new ArrayList<>();
        b.add(4);
        b.add(5);
        b.add(6);
        List<Integer> c = new ArrayList<>();
        c.add(10);
        c.add(8);
        c.add(-12);
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(a);
        arr.add(b);
        arr.add(c);
        System.out.println(diag(arr));
    }
}
