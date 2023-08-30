package chap_16.Sec02.exam02;

public class ButtonExample {
    public static void main(String[] args) {
        // ok 버튼 생성
        Button btnOk = new Button();

        btnOk.setClickListener(()-> {
            System.out.println("OK 버튼을 클릭했습니다.");
        });

        // ok 버튼 클릭
        btnOk.click();


        // cancel 버튼 생성
        Button btnCancel = new Button();

        btnCancel.setClickListener(()->{
            System.out.println("Cancel 버튼을 클릭했습니다.");
        });

        // Cancel 버튼 클릭
        btnCancel.click();
    }
}
