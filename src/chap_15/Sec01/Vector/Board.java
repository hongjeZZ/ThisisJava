package chap_15.Sec01.Vector;

public class Board {
    private String subject;
    private String content;
    private String writer;

    public String getContent() {
        return content;
    }

    public String getSubject() {
        return subject;
    }

    public String getWriter() {
        return writer;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public Board(String subject, String content, String writer){
        this.subject = subject;
        this.content = content;
        this.writer = writer;
    }
}
