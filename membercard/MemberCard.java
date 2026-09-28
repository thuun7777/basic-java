package labwork11;
//Ex1
public class MemberCard {
    private String name;
    private String studentID;
    private String email;

    public void setName(String na){
        this.name = na;
    }
    public void setStudentID(String id){
        this.studentID = id;
    }
    public void setEmail(String em){
        this.email = em;
    }
    public String getName(){
        return name;
    }
    public String getStudentID(){
        return studentID;
    }
    public String getEmail(){
        return email;
    }
}
