import java.util.Date;

public class PrintDate {
    public void printCurrentDate() {
        System.out.println(now());
    }

    private Date now() {
        return new Date();
    }
}