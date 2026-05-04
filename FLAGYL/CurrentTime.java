import java.util.Date;

public class CurrentTime {

    public static void main(String[] args) {

    long millis = System.currentTimeMillis();

//        System.out.println("Millis:" + millis);

    Date date = new Date(millis);

//    Time time = new Time (millis);


    System.out.println("Date, time and year:" + date);
}

}
