package chap_12.Sec03.exam02;

// 컬렉션에 속하는 HashSet 은 Student 클래스에서 만든 hashCode() 와 equals() 메소드를 이용해서 동등 객체인지 판단한다.
// HashSet 은 동등 객체는 저장하지 않기 때문에 s1 과 s2 를 더했을 때 객체 수가 증가하지 않는 것을 볼 수 있다.
import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();

        Student s1 = new Student(1,"안홍제");
        hashSet.add(s1);
        System.out.println("저장된 객체 수: " + hashSet.size());

        Student s2 = new Student(1,"안홍제");
        hashSet.add(s2);
        System.out.println("저장된 객체 수: " + hashSet.size());

        Student s3 = new Student(2,"안홍제");
        hashSet.add(s3);
        System.out.println("저장된 객체 수: " + hashSet.size());
    }
}
