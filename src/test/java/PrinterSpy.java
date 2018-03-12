public class PrinterSpy implements Printer {
    public boolean hasBeenCalled;

    public PrinterSpy() {
        hasBeenCalled = false;
    }

    @Override
    public void print(String text) {
        hasBeenCalled = true;
    }
}
