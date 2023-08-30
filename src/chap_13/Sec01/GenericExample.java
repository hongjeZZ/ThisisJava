package chap_13.Sec01;

// <>에 아무런 타입의 클래스를 넣지 않고 생성할 때 object 타입으로 대입된다.
public class GenericExample {
    public static void main(String[] args) {
        // Box<String> box1 = new Box<String>(); 뒤에는 생략 가능
        Box<String> box1 = new Box<>();
        box1.content = "안녕하세요";
        String str = box1.content;
        System.out.println(str);

        // Box<Integer> box2 = new Box<Integer>();
        Box<Integer> box2 = new Box<>();
        box2.content = 123;
        int value = box2.content;
        System.out.println(value);
    }
}
