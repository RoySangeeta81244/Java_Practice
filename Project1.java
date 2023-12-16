
import java.text.SimpleDateFormat;
import java.util.*;

public class Project1 {

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        Date date = new Date();
        String formattedDate = sdf.format(date);
        System.out.println(formattedDate);
    }
}
