package labwork12;
//Ex4
public class TicketCartTestDrive {
    public static void main(String[] args){
        Ticket[] listTickets = new Ticket[10];
        //this: 10 tickets for u to pick
        TicketCart nowCart = new TicketCart();

        nowCart.count=0;      

        int temp=65;
        for (int i=0; i<10; i++){
            listTickets[i] = new Ticket();                      //////DDAAY DAU NGOAC () LEGEND
            char c = (char) temp;
            listTickets[i].setNameM("Movie "+(i+1));
            listTickets[i].setPrice(70);
            //System.out.println(listTickets[i].getNameM());
            temp++;
        }
        //this: create 10 tickets have info


        //phase1: initial state
        nowCart.check0ut();
        System.out.println();

        //phase2: addTickets
        nowCart.addToCart(listTickets[8]);
        nowCart.addToCart(listTickets[9]);
        nowCart.addToCart(listTickets[1]);
        nowCart.check0ut();
        System.out.println();

        //phase3: removeTickets
        Ticket t = new Ticket();
        t.setNameM("Movie T");
        t.setPrice(70);
        nowCart.removeFromCart(t);
        nowCart.removeFromCart(listTickets[9]);
        nowCart.check0ut();
        System.out.println();

        //phase4
        //nowCart.empty();
        nowCart.count=0;
        for (int i=0; i<10; i++){
            nowCart.addToCart(listTickets[i]);
        }
        nowCart.check0ut();
        nowCart.addToCart(t);
    } 
}