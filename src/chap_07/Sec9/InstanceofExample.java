package chap_07.Sec9;

public class InstanceofExample {
    // main() 메소드에서 바로 호출하기 위해 정적 메소드 선언
    public static void personInfo(Person person){
        // 여기서 메소드를 왜 static (정적) 메소드로 선언하는 지?
        // main 메소드에서 바로 사용하려면 static 을 사용해야함
        // static 을 사용하지 않는다면 main 에서 InstanceofExample 객체를 생성하고 도트를 이용하여 메소드 실행
        System.out.println("name : " + person.name);
        person.walk();

        // person 이 참조하는 객체가 Student 타입인지 확인

        /*  이건 옛날 방식
        if (person instanceof Student){
            Student student = (Student) person;
            System.out.println("StudentNo : " + student.studentNo);
            student.study();
        }*/

        // person 이 참조하는 객체가 student 일 경우 강제 타입 변환
        if(person instanceof Student student){
            System.out.println("StudentNo : " + student.studentNo);
            student.study();
        }
    }
    public static void main(String[] args) {
        Person p = new Person("안홍제");
        personInfo(p);

        System.out.println();

        Person p2 = new Student("김민교",202115041);
        personInfo(p2);
    }
}
