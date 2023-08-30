package chap_09.Sec3;

public class A {
    public void method1(int arg){
        int var = 1;

        class B{
            void method2(){
                System.out.println("arg : " + arg);
                System.out.println("var : " + var);
            }
        }
        // var = 2;
        // arg = 2;
        // 이 코드를 실행하면 에러가 난다.
        // 왜냐하면 메소드 안의 변수 = 로컬 변수 / 메소드 안의 클래스 = 로컬 클래스
        // 로컬 변수가 로컬 클래스 안에서 사용될 때에는 (라인 9,10) 로컬 변수의 수정이 불가능하다.

        System.out.println("arg : " + arg);
        System.out.println("var : " + var);
    }
    public static void main(String[] args) {
        A a = new A();
        a.method1(3);
    }
}
