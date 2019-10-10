import java.util.Scanner;

public class Tiisu {

    public static void main(String args[]) {

        String userChoice;

        Scanner reader = new Scanner(System.in);

        TiisuThread thread = new TiisuThread();

        while(true) {
            System.out.print("Give me your choice: ");
            userChoice = reader.nextLine();

            if("START".equals(userChoice)) {
                thread = new TiisuThread();
                    thread.start();



            }

            else if("STOP".equals(userChoice)) {

                thread.stopThread();

            }

            else if("QUIT".equals(userChoice)) {
                break;
            }
        }
    }
}
