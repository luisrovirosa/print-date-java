import java.util.Date;

public class PrintDate {

    private final Printer printer;

    public PrintDate(ConsolePrinter printer) {
        this.printer = printer;
    }

    public void printCurrentDate() {
        Date now = now();
        print(now.toString());
    }

    private void print(String text) {
        printer.print(text);
    }

    private Date now() {
        return new Date();
    }
}