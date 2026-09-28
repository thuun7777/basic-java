package labwork12;

import java.nio.file.FileAlreadyExistsException;

//Ex4
public class TicketCart {
    public Ticket[] cartContents = new Ticket[10];
    //this: inside class TicketCart
    //10 slots 4 u to pick 10 tickets
    public int count;

    public void addToCart(Ticket t){
        if (count<10){
            cartContents[count]=t;
            count++;
        }
        else{
            System.out.println("The cart is full so you can't add ticket for "+t.getNameM());
        }
    }
    public void removeFromCart(Ticket t){
        if (count>0){
            boolean chk=false;
            for (int i=0; i<count; i++){
                if (t.equals(cartContents[i])){
                    cartContents[i]=cartContents[i+1];
                    count--;
                    chk=true;
                }
                if (chk){
                    cartContents[i]=cartContents[i+1];
                }
            }
            if (chk==false){
                System.out.println("There is no ticket for "+t.getNameM()+" in the cart.");
            }
        }
        else{
            System.out.println("The cart has not have any tickets yet");
        }
    }
    public void check0ut(){
        if (count>0){
            System.out.println("Now your cart is having:");
            int sum=0;
            for(int i=0; i<count; i++){
                sum+=cartContents[i].getPrice();
                System.out.println("Ticket for " + cartContents[i].getNameM());
            }

            System.out.println("Your total bill is: "+sum+".000 VND");
        }
        else{
            System.out.println("Now your cart is having 0 tickets");
        }
    }
    public void empty(){
        if (count==0){
            System.out.println("The cart has not have any tickets yet");   
        }
        else{
            count=0;
        }
    }
}