package labwork11;
//Ex3
public class PlayTime {
    private int hours;
    private int minutes;

    public void setHours(int ho){
        this.hours=ho;
    }
    public void setMinutes(int mi){
        this.minutes=mi;
    }

    public int getHours(){
        return hours;
    }
    public int getMinutes(){
        return minutes;
    }
    
    public PlayTime fix(){
        if (this.minutes>=60){
            this.hours++;
            this.minutes-=60;
        }
        return this;
    }

    public void print(){
        System.out.println(hours + " h " + minutes + " min");
    }
    public PlayTime add(PlayTime pl){
        PlayTime sum = new PlayTime();

        sum.hours = pl.hours + this.hours;
        sum.minutes = pl.minutes + this.minutes;

        if (sum.minutes >= 60){
            sum.hours++;
            sum.minutes -= 60;
        }
        return sum;
    }
    public PlayTime subtract(PlayTime pl){
        PlayTime sub = new PlayTime();

        if (pl.minutes > this.minutes){
            //sub.hours=-1;
            pl.hours++;
            pl.minutes=60-pl.minutes;
        }
        sub.hours += this.hours - pl.hours;
        sub.minutes = this.minutes - pl.minutes;
        return sub;
    }
}
