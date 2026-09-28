package labwork12;

public class Screening{
    private String title;
    private String room;
    private int seats;
    private int sold;

    public void setTitle(String ti){
        this.title = ti;
    }
    public void setRoom(String ro){
        this.room = ro;
    }
    public void setSeats(int se){
        this.seats = se;
    }


    public void sell(int n){
        if (sold+n <= seats){
            sold+=n;
        }
        else sold=seats;
    }
    public void cancel(int n){
        if (sold-n >=0){
            sold-=n;
        }
        else sold=0;
    }
    public int getSold(){
        return sold;
    }
    public void getState(){
        System.out.println(title + ": " + sold + "/" + seats);
    }
}
