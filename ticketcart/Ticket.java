package labwork12;
//Ex4
public class Ticket {
    //public int number; not necessary yet
    private String nameM;
    private int price;
    //each ticket has price: 70.000VND

    public void setNameM(String s){
        this.nameM=s;
    }
    public void setPrice(int p){
        this.price=p;
    }
    public String getNameM(){
        return nameM;
    }
    public int getPrice(){
        return price;
    }
}
