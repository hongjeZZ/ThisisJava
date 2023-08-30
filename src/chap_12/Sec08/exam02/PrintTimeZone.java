package chap_12.Sec08.exam02;

import java.util.Calendar;
import java.util.TimeZone;

public class PrintTimeZone {
    public static void main(String[] args) {
        String[] availableIDs = TimeZone.getAvailableIDs();
        for (String id : availableIDs)
            System.out.println(id);

        TimeZone timeZone = TimeZone.getTimeZone("America/Fort_Wayne");
        Calendar now = Calendar.getInstance(timeZone);
        // 이런 식으로 TimeZone 을 이용하여 Calendar 객체 생성
    }
}
