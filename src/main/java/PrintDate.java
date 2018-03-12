import java.util.Date;

public class PrintDate {
    public void printCurrentDate() {
        Date now = now();
        print(now);
    }

    private void print(Date now) {
        System.out.println(now);
    }

    private Date now() {
        return new Date();
    }
}