package calculator_2;

import java.util.Scanner;


public class Reader {
    public static String read(String prompt) {
        System.out.print(prompt);
        return new Scanner(System.in).nextLine();
    }

    public static int readInt(String prompt) {
        return Integer.parseInt(read(prompt));
    }
}