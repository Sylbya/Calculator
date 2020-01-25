package calculator_2;

public class Main {
    public static void main(String[] args) {
        while (Calculator.isRunning()) {
            try {
                Calculator.execute(Calculator.getCommand());
                System.out.println();
            }
            catch(IllegalCommand e) {
                System.out.println(e);
            }
        }
    }
}