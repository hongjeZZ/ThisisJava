package chap_09.Sec6.AnonymousInterface;

public class Home {
    // Field
    private RemoteControl rc = new RemoteControl() {
        @Override
        public void turnOn() {
            System.out.println("TV를 켭니다.");
        }

        @Override
        public void turnOff() {
            System.out.println("TV를 끕니다.");
        }
    };
    // New
    // Method
    public void use1(){
        rc.turnOn();
        rc.turnOff();
    }

    public void use2(){
        RemoteControl rc = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("에어컨을 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("에어켠을 끕니다.");
            }
        };
        rc.turnOn();
        rc.turnOff();
    }

    public void use3(RemoteControl remoteControl){
        remoteControl.turnOn();
        remoteControl.turnOff();
    }
}
