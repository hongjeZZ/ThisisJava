package chap_12.Sec03.exam04;

public class RecordExample {
    public static void main(String[] args) {
        Member m = new Member("winter","눈송이",25);
        System.out.println(m.age());
        System.out.println(m.id());
        System.out.println(m.name());
        System.out.println(m.toString());       // m 만 넣어도 자동으로 m.toString() 반환

        System.out.println();

        Member m1 = new Member("winter","눈송이",25);
        Member m2 = new Member("winter","눈송이",25);
        System.out.println("m1.hashCode(): " + m1.hashCode());
        System.out.println("m2.hashCode(): " + m2.hashCode());
        System.out.println("m1.equals(m2) " + m1.equals(m2));
    }
}
