package chap_03;

public class Gas {
    int gas ;

    void setGas(int gas){
        this.gas = gas;
    }

    boolean isleftGas(){
        if (gas == 0){
            System.out.println("가스가 없습니다.");
            return false;
        }
        else {
            System.out.println("가스가 남아 있습니다.");
            return true;
        }
    }

    void run(){
        while (true){
            if (gas > 0){
                System.out.println("달립니다. ( 가스잔량 : " + gas + ")");
                gas -= 1;
            }
            else {
                System.out.println("멈춥니다. ( 가스잔량 : " + gas + ")");
                return ;
            }
        }
    }
}
