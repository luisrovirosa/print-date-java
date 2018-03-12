import java.util.Date;

public class PrintDate {
    public void printCurrentDate() {
        Date now = now();
        print(now.toString());
    }

    private void print(String text) {
        System.out.println(text);
    }

    private Date now() {
        return new Date();
    }
}