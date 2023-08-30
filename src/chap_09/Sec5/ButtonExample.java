package chap_09.Sec5;

import chap_09.Sec1.A;

public class ButtonExample {
    public static void main(String[] args) {
        // OK 버튼 객체 생성
        Button btnOk = new Button();
        Button btnCancel = new Button();

        // OK 버튼 이벤트를 처리할 ClickListener 구현 클래스 (로컬 클래스)
        class OkListener implements Button.ClickListener{
            @Override
            public void onClick() {
                System.out.println("OK 버튼을 클릭했습니다.");
            }
        }
        class cancelListener implements Button.ClickListener{
            @Override
            public void onClick() {
                System.out.println("취소 버튼을 클릭했습니다.");
            }
        }
        // OK 버튼에 구현 객체 주입
        btnOk.setClickListener(new OkListener());
        btnCancel.setClickListener(new cancelListener());

        // OK 버튼 클릭
        btnOk.click();
        btnCancel.click();
    }
}
