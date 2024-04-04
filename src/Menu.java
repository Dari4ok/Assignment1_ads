import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    //
    private static void repeat(int pn){
        Scanner scn = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Do you want repeat?\n1.Repeat\n2.Back to main\n0.Exit");
        int Q = scn.nextInt();
        switch (Q){
            case 1:
                switch (pn){
                    case 1:
                        task1();

                }
            case 2:
                Main.main(new String[]{""});
                break;
            case 0:
                break;
        }

    }

    private static String problemsList(int n){
        String[] problems = {"You are given a number “n” and an array of “n” elements, \nwrite the function that returns minimum of them. ",
                "You are given a number “n” and an array of “n” elements, \nwrite the function that returns average of them.",
                "You are given a number “n”, write the function for checking whether“n” is prime.",
                "You are given a number “n”, write the program using recursion for finding “n!”"};

        return problems[n-1];
    }

    public static void task1(){
        Scanner scn = new Scanner(System.in);

        System.out.println(" ");

        System.out.println(problemsList(1));

        System.out.println(" ");

        System.out.println("Enter the size List:");

        int n = scn.nextInt();
        List<Integer> l1 = new ArrayList<Integer>();

        System.out.println("Enter the list:");

        for (int i = 0; i < n; i++) {
            int k = scn.nextInt();
            l1.add(i, k);
        }

        System.out.println("Output:");
        System.out.println(Problems.problem_1(n,l1));

        repeat(1);
    }
}
