package labwork11;
//Ex1
public class MemberCardTestDrive {
    public static void main(String args[]){
        MemberCard mc1 = new MemberCard();
        mc1.setName("OOP");
        System.out.println(mc1.getName());
        
        mc1.setStudentID("003");
        System.out.println(mc1.getStudentID());

        mc1.setEmail("oop@gmail.com");
        System.out.println(mc1.getEmail());
    }
    
}
