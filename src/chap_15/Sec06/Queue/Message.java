package chap_15.Sec06.Queue;

public class Message {
    public String to;
    public String command;

    public Message(String command,String to){
        this.command = command;
        this.to = to;
    }
}
