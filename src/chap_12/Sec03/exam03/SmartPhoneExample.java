package chap_12.Sec03.exam03;

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("애플","IOS");

        String strObj = myPhone.toString();
        // 명시적으로 toString() 을 호출
        System.out.println(strObj);

        System.out.println(myPhone);
        // 자동으로 toString() 을 호출
    }
}
