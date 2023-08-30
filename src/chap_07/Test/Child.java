package chap_07.Test;

public class Child extends Parent{
    private String name;

    public Child(){
        this("안홍제");
        System.out.println("Child() call");
    }

    public Child(String name){
        this.name = name;
        System.out.println("Child(String name) call");
    }
}
