package chap_15.Sec05.Comparable;

// 전에 했던 예제들은 String, Integer 로 자동으로 Comparable 인터페이스를 구현하고 있다.
// 하지만 내가 만드는 객체를 사용하고 싶다면 Comparable 인터페이스를 구현해야 한다.
// Comparable 은 객체 간의 정렬을 위해 필요한 메소드 compareTo 를 재정의 해야한다.
public class Person implements Comparable<Person>{
    public String name;
    public int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        if (age < o.age) return -1;
        else if (age == o.age) return 0;
        else return 1;
   }
}
