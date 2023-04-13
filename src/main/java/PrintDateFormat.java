import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintDateFormat {

    public String printDateFormat(Date date) {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd-yyyy");

        return simpleDateFormat.format(date);
    }
}
