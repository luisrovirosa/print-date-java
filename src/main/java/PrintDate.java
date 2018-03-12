import java.util.Date;

public class PrintDate {
    public void printCurrentDate() {
        Date now = now();
        print(now.toString());
    }

    private void print(String text) {
        Printer consolePrinter = new ConsolePrinter();
        consolePrinter.print(text);
    }

    private Date now() {
        return new Date();
    }
}