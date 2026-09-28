package labwork12;
//Ex5
public class Seat{
    private String row;
    private int number;
    private boolean reserved;

    public void setRow(String ch){
        this.row = ch;
    }
    public String getRow(){
        return row;
    }
    public void setNumber(int nu){
        if (nu<=0){
            System.out.println("Invalid seat number: "+nu);
        }
        else{
            this.number = nu;
        }
    }
    public int getNum(){
        return number;
    }

    public void reserve(){
        if (reserved==false){
            this.reserved=true;
            System.out.println("Seat "+this.getRow()+this.getNum()+": Reserved");
        }
        else{
            System.out.println("Seat "+this.getRow()+this.getNum()+": Already reserved");
        }
    }
    public void release(){
        if (reserved==true){
            this.reserved=false;
            System.out.println("Seat "+this.getRow()+this.getNum()+": Released");
        }
        else{
            System.out.println("Seat "+this.getRow()+this.getNum()+": Not reserved yet");
        }
    }
    public void printInfo(){
        if (reserved==true)
            System.out.println("Seat "+this.row+this.number+": Reversed");
        else
            System.out.println("Seat "+this.row+this.number+": Available");
    }
}