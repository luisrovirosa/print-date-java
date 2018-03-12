import java.util.Date;

public class PrinterSpy implements Printer {
    public boolean hasBeenCalled;
    private String calledWith;

    public PrinterSpy() {
        hasBeenCalled = false;
        calledWith = "";
    }

    @Override
    public void print(String text) {
        calledWith = text;
        hasBeenCalled = true;
    }

    public boolean hasBeenCalledWith(String text) {
        return text.equals(calledWith);
    }
}
