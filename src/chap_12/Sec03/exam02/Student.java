package chap_12.Sec03.exam02;
// HashCode() 메소드
public class Student {
    private int no;
    private String name;

    public Student(int no,String name){
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        int hashcode = no + name.hashCode();
        return hashcode;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student target){
            if (no == target.getNo() && name.equals(target.getName()))
                return true;
        }
        return false;
    }

}
