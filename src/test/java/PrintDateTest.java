import org.junit.Test;

import java.util.Date;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class PrintDateTest {
    @Test
    public void printDate() {
        PrinterSpy printer = new PrinterSpy();
        Date expectedDate = new Date();
        Calendar calendar = new CalendarStub(expectedDate);
        PrintDate printDate = new PrintDate(printer, calendar);

        printDate.printCurrentDate();

        assertThat(printer.hasBeenCalled, is(true));
    }
}