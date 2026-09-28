package labwork11;
//Ex2
public class FilmTestDrive {
    public static void main(String args[]){
        Film f1 = new Film();
        f1.setTitle("Dune");
        f1.setYear(2021);
        f1.setDuration(155);

        f1.getTitle(); f1.getYear(); f1.getDuration();
        
        f1.play();
        
        Film f2 = new Film();
        f2.setTitle("Pulp Fiction");
        f2.setYear(1994);
        f2.setDuration(149);

        f2.play();
    //"Now playing: Dune (2021), 155 min"
    //"Now playing: Pulp Fiction (1994), 149 min"
    }
}
