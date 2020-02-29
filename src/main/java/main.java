import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class main {
    public static void main(String[] args) throws ParseException {
        System.out.println(new Date());
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        Date date1 = dateFormat.parse("2020-02-27");
    }
}
