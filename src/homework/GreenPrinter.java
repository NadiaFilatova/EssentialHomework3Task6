package homework;

public class GreenPrinter extends Printer{
    @Override
    public void print(String value) {
        System.out.println(AnsiCodes.ANSI_GREEN + value +AnsiCodes.ANSI_RESET);
    }
}
