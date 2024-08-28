import java.util.Scanner;
public class Main {

    public static String convertMillis(long millis){
        //143,000 143s 2m 0h
        long seconds = millis/1000;
        long minutes = seconds/60;
        long hours = minutes/60;

        
        String time = hours + "h:" + minutes % 60 + "m:" + seconds % 60 + "s";
        return time;
    }

    public static void main(String[] args) {

        //most likely going to use modulus for this %

        long milliseconds;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of milliseconds you would like to convert: ");

        milliseconds = scanner.nextLong();
        String convertTime = convertMillis(milliseconds);
        System.out.println(convertTime);

    }
}