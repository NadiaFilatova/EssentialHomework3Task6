package homework;

public class RedPrinter extends Printer {
    @Override
    public void print(String value) {
        System.out.println(AnsiCodes.ANSI_RED + value + AnsiCodes.ANSI_RESET);
    }
}
