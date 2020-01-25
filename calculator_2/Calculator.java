package calculator_2;

import java.util.stream.IntStream;

public class Calculator {
    private static int statistics = 0;
    private static boolean isRunning = true;

    enum Command {
        SUM,
        DIFFERENCE,
        PRODUCT,
        END
    }

    public static boolean isRunning() {
        return isRunning;
    }

    public static Command getCommand() throws IllegalCommand {
        String command = Reader.read("command: ");
        try {
            return Command.valueOf(command.toUpperCase());
        }
        catch (Exception e) {
            throw new IllegalCommand("Command " + command + " not found");
        }
    }

    private static void printResult(String operation, int result) {
        System.out.println(operation + " of the values " + result);
    }

    private static int[] readOperands(int noOfOperands) {
        int[] array = new int[noOfOperands];
        for (int i = 0; i < noOfOperands; i++) {
            array[i] = Reader.readInt(String.format("value%d: ", i + 1));
        }
        return array;
    }

    public static int sum(int... a) {
        return IntStream.of(a).sum();
    }

    public static int product(int... a) {
        int result = 1;
        for (int i = 0; i < a.length; i++) {
            result *= a[i];
        }
        return result;
    }

    public static void execute(Command command) {
        switch (command) {
            case SUM: {
                int[] operands = readOperands(2);
                printResult("Sum", sum(operands));
                statistics++;
                break;
            }
            case DIFFERENCE: {
                int[] operands = readOperands(2);
                printResult("Difference", operands[0] - operands[1]);
                statistics++;
                break;
            }
            case PRODUCT: {
                int[] operands = readOperands(2);
                printResult("Product", product(operands));
                statistics++;
                break;
            }
            case END: {
                System.out.println("Calculations done " + statistics);
                isRunning = false;
                break;
            }
        }
    }
}