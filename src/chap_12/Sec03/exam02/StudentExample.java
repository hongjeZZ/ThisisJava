package chap_12.Sec03.exam02;

public class StudentExample {
    public static void main(String[] args) {
        Student s1 = new Student(1,"안홍제");
        Student s2 = new Student(1,"안홍제");

        if (s1.hashCode() == s2.hashCode()) {
            if (s1.equals(s2))
                System.out.println("동등 객체이다.");
            else
                System.out.println("데이터가 다르므로 동등 객체가 아니다.");
        }
        else
            System.out.println("해시코드가 다르므로 동등 객체가 아니다.");
    }
}
