package work22;
import java.util.Date;

public class Task22 {
    public static void main(String[] args) {
        Date date = new Date();
        long time = System.currentTimeMillis() / 1000L;
        long sec = time % 60L;
        long min = time / 60L % 60L;
        long hour = time / 3600L % 24L + 2L;
        System.out.println(date + ":" + hour + ":" + min + ":" + sec);
    }

    }

