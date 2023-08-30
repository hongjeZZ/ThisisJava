package chap_13.Sec03;

public class Box<T>{
    private T t;

    public T get(){
        return t;
    }

    public void set(T t){
        this.t = t;
    }
}
