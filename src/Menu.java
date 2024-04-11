import java.util.Scanner;


public class Menu {

    static Scanner scn = new Scanner(System.in);

    private static void repeat(int pn){
        System.out.println("--------------------");
        System.out.println("Do you want repeat?\n1.Repeat\n2.Back to main\n0.Exit");
        int Q = scn.nextInt();
        switch (Q){
            case 0:
                System.exit(0);
            case 1:
                System.out.println("--------------------");

                System.out.println(Menu.problemsList(pn));

                System.out.println("--------------------");
                switch (pn){
                    case 1:
                        task1();
                    case 2:
                        task2();
                    case 3:
                        task3();
                    case 4:
                        task4();
                    case 5:
                        task5();
                    case 6:
                        task6();
                    case 7:
                        task7();
                    case 8:
                        task8();
                    case 9:
                        task9();
                    case 10:
                        task10();
                }
            case 2:
                Main.main(new String[]{""});
                break;
            default:
                System.out.println("Unexpected value: " + Q);
                repeat(pn);
        }

    }

    public static String problemsList(int n){
        String[] problems = {"You are given a number “n” and an array of “n” elements, \nwrite the function that returns minimum of them. ",
                "You are given a number “n” and an array of “n” elements, \nwrite the function that returns average of them.",
                "You are given a number “n”, write the function for checking whether“n” is prime.",
                "You are given a number “n”, write the program using recursion for finding “n!”",
                "You are given a number “n”, write the function for finding n-th\nelements in Fibonacci sequence using recursion. (Fn = Fn-1+ Fn-2). F0= 0, F1 = 1.",
                "You are given numbers “a” and “n”, write the function that returns “an”. ",
                "You are given a number “n” and an array of “n” elements, write the program that \nreturns given array in reverse order without using array data structure.",
                "You are given a string “s”, write the function for checking whether “s” is all consists of digits.",
                "You are given numbers“n” and “k”,write the program that finds Cnk(binomial coefficient) using formula Cnk=Cn−1 k−1+Cn−1 k where Cn 0=Cn n=1.",
                "You are given “a” and “b”, write the function for finding GCD(a, b) using recursion. (Hint: Euclidean Algorithm)"};

        return problems[n-1];
    }

    public static void task1(){
        System.out.println("Enter the size List:");

        int n = scn.nextInt();

        int[] l1 = new int[n];

        System.out.println("Enter the list:");

        for (int i = 0; i < n; i++) {
            l1[i] = scn.nextInt();
        }

        System.out.println("Output:");

        double start_time = System.nanoTime();

        System.out.println(Problems.problem_1(n,l1));

        double end_time = System.nanoTime();

        System.out.println("\nTime taken: " + (end_time - start_time)/1000000 + " ms");

        repeat(1);
    }

    public static void task2(){
        System.out.println("Enter the size List:");

        int n = scn.nextInt();

        int[] l1 = new int[n];

        System.out.println("Enter the list:");

        for (int i = 0; i < n; i++) {
            l1[i] = scn.nextInt();
        }

        double start_time = System.nanoTime();

        System.out.println(Problems.problem_2(n,l1));

        double end_time = System.nanoTime();

        System.out.println("\nTime taken: " + (end_time - start_time)/1000000 + " ms");

        repeat(2);
    }

    public static void task3(){
        System.out.println("Enter the number:");
        int n = scn.nextInt();

        System.out.println("Output:");

        double start_time = System.nanoTime();

        System.out.println(Problems.problem_3(n , 2));

        double end_time = System.nanoTime();
        System.out.println("\nTime taken: " + (end_time - start_time)/1000000 + " ms");


        repeat(3);
    }

    public static void task4(){
        System.out.println("Enter the number:");
        int n = scn.nextInt();

        System.out.println("Output:");

        double start_time = System.nanoTime();

        System.out.println(Problems.problem_4(n));

        double end_time = System.nanoTime();
        System.out.println("\nTime taken: " + (end_time - start_time)/1000000 + " ms");

        repeat(4);
    }

    public static void task5(){
        System.out.println("Enter the number:");
        int n = scn.nextInt();

        System.out.println("Output:");

        double start_time = System.nanoTime();

        System.out.println(Problems.problem_5(n));

        double end_time = System.nanoTime();
        System.out.println("\nTime taken: " + (end_time - start_time)/1000000 + " ms");

        repeat(5);
    }

    public static void task6(){
        System.out.println("Enter the numbers:");
        int a = scn.nextInt();
        int n = scn.nextInt();

        System.out.println("Output:");

        double start_time = System.nanoTime();

        System.out.println(Problems.problem_6(a, n, a));

        double end_time = System.nanoTime();
        System.out.println("\nTime taken: " + (end_time - start_time)/1000000 + " ms");

        repeat(6);
    }

    public static void task7(){
        System.out.println("Enter the size List:");

        int n = scn.nextInt();
        int[] l1 = new int[n];
        int[] res = new int[n];

        System.out.println("Enter the list:");

        for (int i = 0; i < n; i++) {
            int k = scn.nextInt();
            l1[i] = k;
        }

        System.out.println("Output:");

        double start_time = System.nanoTime();

        int[] l2 = Problems.problem_7(n, l1, res, 0);

        double end_time = System.nanoTime();

        for (int i = 0; i < n; i++) {
            System.out.print(l2[i] + " ");
        }

        System.out.println("\nTime taken: " + (end_time - start_time)/1000000 + " ms");

        repeat(7);
    }

    public static void task8(){
        System.out.println("Enter the String:");
        String a = scn.nextLine();

        System.out.println("Output:");

        double start_time = System.nanoTime();

        System.out.println(Problems.problem_8(a, 0));

        double end_time = System.nanoTime();
        System.out.println("\nTime taken: " + (end_time - start_time)/1000000 + " ms");

        repeat(8);
    }

    public static void task9(){
        System.out.println("Enter the numbers:");
        int n = scn.nextInt();
        int k = scn.nextInt();

        System.out.println("Output:");

        double start_time = System.nanoTime();

        System.out.println(Problems.problem_9(n, k));

        double end_time = System.nanoTime();
        System.out.println("\nTime taken: " + (end_time - start_time)/1000000 + " ms");

        repeat(9);
    }

    public static void task10(){
        System.out.println("Enter the numbers:");
        int n = scn.nextInt();
        int k = scn.nextInt();

        System.out.println("Output:");

        double start_time = System.nanoTime();

        System.out.println(Problems.problem_10(n, k));

        double end_time = System.nanoTime();
        System.out.println("\nTime taken: " + (end_time - start_time)/1000000 + " ms");

        repeat(10);
    }

}
