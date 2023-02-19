package homework;

public class BluePrinter extends Printer{
    @Override
    public void print(String value) {
        System.out.println(AnsiCodes.ANSI_BLUE + value + AnsiCodes.ANSI_RESET);
    }
}
