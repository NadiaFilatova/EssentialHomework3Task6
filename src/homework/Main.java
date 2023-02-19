package homework;
//  Користуюся Ubuntu, тому не впевнена що правильно буде відображати на вінді
public class Main {
    public static void main(String[] args) {
        Printer defaultPrinter = new Printer();
        Printer bluePrinter = new BluePrinter();
        Printer redPrinter = new RedPrinter();
        Printer greenPrinter = new GreenPrinter();
        Printer yellowPrinter = new YellowPrinter();

        defaultPrinter.print("default text");
        bluePrinter.print("blue text");
        redPrinter.print("red text");
        greenPrinter.print("green text");
        yellowPrinter.print("yellow text");

    }
}
