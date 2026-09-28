package labwork12;

public class ScreeningTestDrive {
    public static void main(String[] args){
        Screening scr = new Screening();
        scr.setTitle("Dune");
        scr.setRoom("2H-201");
        scr.setSeats(40);
        scr.sell(3);
        scr.cancel(1);
        scr.getState();
    }
}
