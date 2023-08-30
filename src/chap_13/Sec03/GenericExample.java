package chap_13.Sec03;


public class GenericExample {
    public static <T> Box<T> boxing(T t){
        Box box = new Box();
        box.set(t);
        return box;
    }

    public static void main(String[] args) {
        Box<Integer> box1 = boxing(100);
        int value = box1.get();
        System.out.println(value);

        Box<String> box2 = boxing("안홍제");
        String str = box2.get();
        System.out.println(str);
    }
}
