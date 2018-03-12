import java.util.Date;

public class PrintDate {

    private final Printer printer;

    public PrintDate(Printer printer) {
        this.printer = printer;
    }

    public void printCurrentDate() {
        print(now());
    }

    private void print(String text) {
        printer.print(text);
    }

    private String now() {
        return new Date().toString();
    }
}