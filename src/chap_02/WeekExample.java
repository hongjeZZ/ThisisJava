package chap_02;

import java.util.Calendar;

public class WeekExample {
    public static void main(String[] args) {

        //열거 타입 변수 선언
        _Enum today = null;

        //열거값 대입
        today = _Enum.THURSDAY;

        //name 메소드
        String name = today.name();
        System.out.println(name);
        System.out.println(today);

        //ordinal 메소드
        int ordinal = today.ordinal();
        System.out.println(ordinal);

        //열거값 비교
        if (today == _Enum.FRIDAY)
        {
            System.out.println("오늘은 불금이 아닙니다.");
        }else {
            System.out.println("오늘은 신나는 금요일입니다.");
        }

        //컴퓨터의 요일 정보 얻기

        //Calendar 얻기
        Calendar cal = Calendar.getInstance();

        //오늘의 요일정보 얻기(1-7)
        int week = cal.get(Calendar.DAY_OF_WEEK);

        //숫자를 열거 상수로 변환해서 변수에 대입
        switch (week) {
            case 1:
                today = _Enum.MONDAY;
            case 2:
                today = _Enum.TUESDAY;
            case 3:
                today = _Enum.WEDNESDAY;
            case 4:
                today = _Enum.THURSDAY;
            case 5:
                today = _Enum.FRIDAY;
            case 6:
                today = _Enum.SATURDAY;
            case 7:
                today = _Enum.SUNDAY;
        }

        if (today == _Enum.WEDNESDAY)
            System.out.println("오늘은 수요일 입니다");
        else
            System.out.println("오늘은 수요일이 아닙니다");
    }
}
