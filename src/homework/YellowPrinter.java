package homework;

public class YellowPrinter extends Printer {
    @Override
    public void print(String value) {
        System.out.println(AnsiCodes.ANSI_YELLOW + value + AnsiCodes.ANSI_RESET);
    }
}
