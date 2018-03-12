import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class PrintDateTest {
    @Test
    public void printDate() {
        PrinterSpy printer = new PrinterSpy();
        PrintDate printDate = new PrintDate(printer);

        printDate.printCurrentDate();

        assertThat(printer.hasBeenCalled, is(true));
    }
}