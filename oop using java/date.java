import java.text.SimpleDateFormat;
import java.util.Date;
public class date {
public static void main (String[] args){
    Date obj = new Date () ;
    SimpleDateFormat formatter= new SimpleDateFormat("HH-mm-ss");
    String newdate=formatter.format(obj);
    System.out.println("after formatting :"+newdate);
    }
}