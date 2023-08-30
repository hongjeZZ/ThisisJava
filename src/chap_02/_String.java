package chap_02;

public class _String {
    public static void main(String[] args) {
        //문자열의 선언 2가지 방법
        String name1 = "안홍제";
        String name2 = "안홍제";
        String name3 = new String("안홍제");

        if (name1 == name2)
            System.out.println("name1과 name2 의 참조가 같음");
        if (name2 == name3)
            System.out.println("name2과 name3 의 참조가 같음");
        else
            System.out.println("name2과 name3 의 참조가 다름");
    }
}
