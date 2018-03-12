import java.util.Date;

public class CalendarStub implements Calendar {
    private final Date expectedDate;

    public CalendarStub(Date expectedDate) {
        this.expectedDate = expectedDate;
    }

    @Override
    public Date now() {
        return expectedDate;
    }
}
