package chap_16.Sec02.exam02;

public class Button {
    // 클래스 안에 중첩 인터페이스를 선언하는 이유 : ClickListener 라는 인터페이스는 Button 없이는 의미가 없기 때문
    public static interface ClickListener{
        void OnClick();
    }

    private ClickListener clickListener;

    public void setClickListener(ClickListener clickListener){
        this.clickListener = clickListener;
    }

    public void click(){
        this.clickListener.OnClick();
    }
}
