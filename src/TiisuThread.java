import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TiisuThread extends Thread {

    private volatile boolean exit = false;

    public void run() {
        try {
            while(!exit) {
                LocalDateTime timeAtm = LocalDateTime.now();
                DateTimeFormatter timeAtmForm = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

                String formattedDate = timeAtm.format(timeAtmForm);

                System.out.println(formattedDate +  " Tiisu, We want more!");

                sleep(5000);
            }
        }
        catch(InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void stopThread() {
        exit = true;
    }
}
