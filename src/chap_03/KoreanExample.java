package chap_03;

public class KoreanExample {
    public static void main(String[] args) {
        Korean k1 = new Korean("안홍제","20000315");
        System.out.println(k1.nation);
        System.out.println(k1.name);
        System.out.println(k1.ssn);

        Korean k2 = new Korean("노무현","19640503");
        System.out.println(k2.nation);
        System.out.println(k2.name);
        System.out.println(k2.ssn);

        // nation 국적은 동일하기 때문에 필드값으로 사용 - 생성자에서 name, ssn 만 받음
    }
}
