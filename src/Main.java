import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //
        System.out.println("Hello! \nChoose are task(1-10):");
        int n = scn.nextInt();

        switch (n){
            case 1:
                Menu.task1();
        }

    }
}