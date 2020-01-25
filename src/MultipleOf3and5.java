public class MultipleOf3and5 {

    static void countMultiples(int n, int m)
    {
        if(n ==1 && m==1){
            System.out.print(1 + " ");
        }
        for (int i = n; i <= m; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.print(i + " ");
        }
    }

    public static void main(String args[]){
        int a = 1;
        int b = 10000;
        countMultiples(a, b);
    }
}
