public class Problems {

    public static int problem_1(int n, int [] l1){
        int min = l1[0];
        for(int i = 1; i < n; i++){
            if (l1[i] < min){
                min = l1[i];
            }
        }

        return min;
    }

    public static double problem_2(int n, int [] l2){

        double average = 0;

        for(int i = 0; i < n; i++){
            average += l2[i];
        }

        return average/n;
    }


    public static String problem_3(int n, int i){
        String prime = "Prime";
        String composite = "Composite";

        if(n == 0 || n == 1) return composite;

        if(n==i) return prime;

        if (n % i == 0) return composite;

        i++;

        return problem_3(n, i);
    }


    public static int problem_4(int n){

        if (n == 0) return 1;

        return n * problem_4(n-1);
    }

    public static int problem_5(int n){
        if (n == 1 || n == 2) return 1;

        return problem_5(n-1) + problem_5(n-2);
    }

    public static int problem_6(int a, int n, int s){
        if (n == 1) return a;
        return problem_6(a*s, n - 1, s);
    }

    public static int[] problem_7(int n, int[] l1, int[] res, int i){
        if(n == 0)
            return res;
        res[i] = l1[n-1];
        return problem_7(n - 1, l1, res, i + 1);
    }

    public static String problem_8(String a, int i){

        if (i == a.length())
            return "No";

        if (Character.isDigit(a.charAt(i))) {

            return "Yes";
        }

        return problem_8(a, i + 1);
    }

    public static int problem_9(int n, int k){
        if(k == 0 || k == n) return 1;

        return problem_9(n-1, k-1) + problem_9(n - 1, k);
    }

    public static int problem_10(int n, int k){
        if (k == 0){
            return n;
        }

        return problem_10(k, n % k);
    }

    public static boolean problem_11(String a, int i, int n){
        if (i == n || (i + 1 == n && a.length()%2 == 0)){
            return true;
        }

        if (a.charAt(i) != a.charAt(n)){
            return false;
        }

        return problem_11(a, i + 1, n - 1);
    }

}
