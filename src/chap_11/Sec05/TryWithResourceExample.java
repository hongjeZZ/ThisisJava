package chap_11.Sec05;
// 리소스의 자동 닫기
// 핵심은 AutoClosable 이라는 인터페이스를 구현하고 있어야 가능하다.
// try ( 변수 ) 를 넣어서 사용한다.

public class TryWithResourceExample {
    public static void main(String[] args) throws Exception{

        MyResource res1 = null;

        try {
            // 리소스 열기
            res1 = new MyResource("res1");
            // 리소스 읽기
            System.out.println(Integer.parseInt(res1.read1()));
            System.out.println(Integer.parseInt(res1.read2())); // "ABC" 를 리턴함으로 예외 발생
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            res1.close();
        }
        System.out.println();


        try(MyResource res2 = new MyResource("res2")) {
            // 리소스 읽기
            System.out.println(Integer.parseInt(res2.read1()));
            System.out.println(Integer.parseInt(res2.read2())); // "ABC" 를 리턴함으로 예외 발생
        } catch (Exception e){
            e.printStackTrace();
        }
        System.out.println();


        MyResource res3 = new MyResource("res3");
        try(res3) {
            // 리소스 읽기
            System.out.println(Integer.parseInt(res3.read1()));
            System.out.println(Integer.parseInt(res3.read2())); // "ABC" 를 리턴함으로 예외 발생
        } catch (Exception e){
            e.printStackTrace();
        }
        System.out.println();


        MyResource res4 = new MyResource("res4");
        MyResource res5 = new MyResource("res5");
        try(res4;res5) {
            // 리소스 읽기
            System.out.println(Integer.parseInt(res4.read1()));
            System.out.println(Integer.parseInt(res4.read2())); // "ABC" 를 리턴함으로 예외 발생
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
