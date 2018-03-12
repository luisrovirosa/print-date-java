import org.junit.Test;

import java.util.Date;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class PrintDateTest {
    @Test
    public void should_print_the_current_date() {
        PrinterSpy printer = new PrinterSpy();
        Date expectedDate = new Date();
        Calendar calendar = new CalendarStub(expectedDate);
        PrintDate printDate = new PrintDate(printer, calendar);

        printDate.printCurrentDate();

        assertThat(printer.hasBeenCalledWith(expectedDate.toString()), is(true));
    }

    @Test
    public void should_print_the_current_date_with_mockito() {
        Printer printer = mock(Printer.class);
        Calendar calendar = mock(Calendar.class);
        Date expectedDate = new Date();
        when(calendar.now()).thenReturn(expectedDate);
        PrintDate printDate = new PrintDate(printer, calendar);

        printDate.printCurrentDate();

        verify(printer).print(expectedDate.toString());
    }
}