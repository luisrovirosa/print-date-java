import java.util.Date;

public class PrintDate {

    private final Printer printer;
    private final Calendar calendar;

    public PrintDate(Printer printer) {
        this.printer = printer;
        calendar = new SpainCalendar();
    }

    public void printCurrentDate() {
        print(now());
    }

    private void print(String text) {
        printer.print(text);
    }

    private String now() {
        Date now = calendar.now();
        return now.toString();
    }
}