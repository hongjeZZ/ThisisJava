package chap_09.Sec6.AnonymousClass;

public class Car {
    // 필드로 타이어 객체 대입
    private Tire tire1 = new Tire();
    private Tire tire2 = new Tire(){
        @Override
        public void roll() {
            System.out.println("익명 자식 tire1이 굴러갑니다.");
        }
    };

    // 메소드 (필드 이용)
    public void run1(){
        tire1.roll();
        tire2.roll();
    }

    // 메소드 (로컬 변수 이용)
    public void run2(){
        Tire tire = new Tire(){
            @Override
            public void roll() {
                System.out.println("익명 자식 tire2가 굴러갑니다.");
            }
        };
        tire.roll();
    }

    // 메소드 (매개변수 이용)
    public void run3(Tire tire){
        tire.roll();
    }

}
