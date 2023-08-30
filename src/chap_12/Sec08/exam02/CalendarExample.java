package chap_12.Sec08.exam02;

import java.util.Calendar;

// Calendar Class 는 추상 클래스이기 때문에 new 생성자말고 .getInstance(); 메소드를 사용해야함
public class CalendarExample {
    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();

        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        int date = cal.get(Calendar.DATE);

        int week = cal.get(Calendar.DAY_OF_WEEK);
        String strWeek = null;

        switch (week){
            case Calendar.MONDAY: strWeek = "월"; break;
            case Calendar.TUESDAY: strWeek = "화"; break;
            case Calendar.WEDNESDAY: strWeek = "수"; break;
            case Calendar.THURSDAY: strWeek = "목"; break;
            case Calendar.FRIDAY: strWeek = "금"; break;
            case Calendar.SATURDAY: strWeek = "토"; break;
            case Calendar.SUNDAY: strWeek = "일"; break;
        }
    }
}
