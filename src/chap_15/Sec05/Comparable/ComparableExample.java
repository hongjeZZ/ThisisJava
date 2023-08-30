package chap_15.Sec05.Comparable;

import java.util.TreeSet;

public class ComparableExample {
    public static void main(String[] args) {
        TreeSet<Person> people = new TreeSet<>();

        people.add(new Person("안홍제",24));
        people.add(new Person("정지훈",23));
        people.add(new Person("임준수",25));
        people.add(new Person("이경준",28));

        for (Person p : people){
            System.out.println(p.name + " - " + p.age);
        }
    }
}
