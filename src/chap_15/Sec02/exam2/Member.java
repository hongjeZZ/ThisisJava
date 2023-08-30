package chap_15.Sec02.exam2;

// HashSet 은 동일한 객체는 중복 저장하지 않는다.
// HashSet 은 hashCode() 메소드의 리턴 값이 같고, equals() 가 true 를 반환하면 동일 객체라고 판단하여 저장하지 않는다.

public class Member {
    public String name;
    public int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // hashCode() 의 재정의
    @Override
    public int hashCode() {
        return name.hashCode() + age;     // 이름과 나이가 같다면 동일한 해쉬코드가 리턴된다.
    }

    @Override
    // equals() 의 재정의
    public boolean equals(Object obj) {
        if (obj instanceof Member target) {
            return target.name.equals(name) && (target.age == age);
            // 이름과 나이가 같다면 true 가 리턴됨
        }else return false;
    }
}
