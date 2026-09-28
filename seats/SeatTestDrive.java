package labwork12;
//Ex5
public class SeatTestDrive {
    public static void main(String[] args) {
    Seat s = new Seat();    // x    row     num.    reserved    printed
    s.setRow("C");      // 1     C
    s.setNumber(12);        // 2     C      12                  
    s.reserve();            // 3     C      12          1       Seat C12: Reserved
    s.reserve();            // 4     C      12          1       Seat C12: Already reserved                     
    s.release();            // 5     C      12          0       Seat C12: Released
    s.release();            // 6     C      12          0       Seat C12: Not reserved yet
    s.setNumber(-4);        // 7     C      12          0       Invalid seat number: -4
    s.printInfo();          // 8     C      12          0       Seat C12: Available
    }
    /* Seat C12: Confirmed
    Seat C12: Held. Not available
    Seat C12: Reservation canceled
    Seat C12: Not your seat to release
    Error: Not Valid
    You have 0 seats
     */
}
