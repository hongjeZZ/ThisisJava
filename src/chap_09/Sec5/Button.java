package chap_09.Sec5;

public class Button {
    // 중첩 인터페이스
    public static interface ClickListener{
        void onClick();
    }
    // 필드
    private ClickListener clickListener;
    public void setClickListener(ClickListener clickListener){
        this.clickListener = clickListener;
    }

    public void click(){
        this.clickListener.onClick();
    }
}
