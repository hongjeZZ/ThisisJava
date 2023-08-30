package chap_03;

public class Television {
    static String company = "My company";
    static String model = "LCD";

    static String info;

    // 정적 필드의 초기화 (복잡한 과정일 때)

    static {
        System.out.println(1);
        info = company + "-" + model;
    }

    static {
        System.out.println(2);
    }

}
