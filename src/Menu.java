import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Menu {
    private static void repeat(int pn){
        Scanner scn = new Scanner(System.in);
        System.out.println("--------------------");
        System.out.println("Do you want repeat?\n1.Repeat\n2.Back to main\n0.Exit");
        int Q = scn.nextInt();
        switch (Q){
            case 0:
                System.exit(0);
            case 1:
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
                }
            case 2:
                Main.main(new String[]{""});
                break;
            default:
                System.out.println("Unexpected value: " + Q);
                repeat(pn);
        }

    }

    private static String problemsList(int n){
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
        Scanner scn = new Scanner(System.in);

        System.out.println("--------------------");

        System.out.println(problemsList(1));

        System.out.println("--------------------");

        System.out.println("Enter the size List:");

        int n = scn.nextInt();
        List<Integer> l1 = new ArrayList<>();

        System.out.println("Enter the list:");

        for (int i = 0; i < n; i++) {
            int k = scn.nextInt();
            l1.add(i, k);
        }

        System.out.println("Output:");

        double start_time = System.nanoTime();

        System.out.println(Problems.problem_1(n,l1));

        double end_time = System.nanoTime();

        System.out.println("\nTime taken: " + (end_time - start_time)/1000000 + " ms");

        repeat(1);
    }

    public static void task2(){
        Scanner scn = new Scanner(System.in);
        System.out.println("--------------------");
        System.out.println(problemsList(2));
        System.out.println("--------------------");

        System.out.println("Enter the size List:");

        int n = scn.nextInt();

        List<Integer> l1 = new ArrayList<>();

        System.out.println("Enter the list:");

        for (int i = 0; i < n; i++) {
            int k = scn.nextInt();
            l1.add(i, k);
        }

        double start_time = System.nanoTime();

        System.out.println(Problems.problem_2(n,l1));

        double end_time = System.nanoTime();

        System.out.println("\nTime taken: " + (end_time - start_time)/1000000 + " ms");

        repeat(2);
    }

    public static void task3(){
        Scanner scn = new Scanner(System.in);
        System.out.println("--------------------");
        System.out.println(problemsList(3));
        System.out.println("--------------------");

        System.out.println("Enter the number:");
        int n = scn.nextInt();

        System.out.println("Output:");

        double start_time = System.nanoTime();

        System.out.println(Problems.problem_3(n));

        double end_time = System.nanoTime();
        System.out.println("\nTime taken: " + (end_time - start_time)/1000000 + " ms");

        Problems.i = 2;

        repeat(3);
    }

    public static void task4(){
        Scanner scn = new Scanner(System.in);
        System.out.println("--------------------");
        System.out.println(problemsList(4));
        System.out.println("--------------------");

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
        Scanner scn = new Scanner(System.in);
        System.out.println("--------------------");
        System.out.println(problemsList(5));
        System.out.println("--------------------");

        System.out.println("Enter the number:");
        int n = scn.nextInt();

        System.out.println("Output:");

        double start_time = System.nanoTime();

        System.out.println(Problems.problem_5(n));

        double end_time = System.nanoTime();
        System.out.println("\nTime taken: " + (end_time - start_time)/1000000 + " ms");

        repeat(5);
    }




}
