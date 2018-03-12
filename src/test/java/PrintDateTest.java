import org.junit.Test;

public class PrintDateTest {
    @Test
    public void printDate() {
        PrintDate printDate = new PrintDate(new ConsolePrinter());

        printDate.printCurrentDate();

        // How can we test this function?
    }
}