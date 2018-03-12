import java.util.Date;

public class PrintDate {

    private final Printer printer;
    private final Calendar calendar;

    public PrintDate(Printer printer, SpainCalendar calendar) {
        this.printer = printer;
        this.calendar = calendar;
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