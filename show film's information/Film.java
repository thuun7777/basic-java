package labwork11;
//Ex2
public class Film {
    private String title;
    private int year;
    private int duration;

    public void setTitle(String na){
        this.title = na;
    }
    public void setYear(int ye){
        this.year = ye;
    }
    public void setDuration(int du){
        this.duration = du;
    }
    
    public String getTitle(){
        return title;
    }
    public int getYear(){
        return year;
    }
    public  int getDuration(){
        return duration;
    }

    public void play(){
        System.out.println("Now playing: " + title + " (" + year + "), " + duration + " min");
    }
}
