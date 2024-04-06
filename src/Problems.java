import java.util.List;

public class Problems {

    public static int problem_1(int n, List<Integer> l1){
        int min = 999999999;
        for(int i = 0; i < n; i++){
            if (l1.get(i) < min){
                min = l1.get(i);
            }
        }

        return min;
    }

    public static double problem_2(int n, List<Integer> l2){

        double average = 0;

        for(int i = 0; i < n; i++){
            average += l2.get(i);
        }

        return average/n;
    }

    public static int i = 2;

    public static String problem_3(int n){
        String output1 = "Prime";
        String output2 = "Composite";

        if(n == 0 || n == 1) return output2;

        if(n==i) return output1;

        if (n % i == 0) return output2;

        i++;

        return problem_3(n);
    }


    public static int problem_4(int n){

        if (n == 0) return 1;

        return n * problem_4(n-1);
    }

}
