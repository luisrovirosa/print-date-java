import java.util.Date;

public class PrintDate {

    private final Printer printer;
    private final Calendar calendar;

    public PrintDate(Printer printer, Calendar calendar) {
        this.printer = printer;
        this.calendar = calendar;
    }

    public PrintDate() {
        this(new ConsolePrinter(), new SpainCalendar());
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