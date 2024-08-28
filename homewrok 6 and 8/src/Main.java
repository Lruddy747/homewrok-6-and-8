import java.util.Scanner;
public class Main {
    public static double footToMeter(double foot){
        double newMeter = foot * 0.305;
        return newMeter;
    }
    public static double meterToFoot(double meter){
        double newfeet = meter * 0.305;
        return newfeet;
    }

    public static void main(String[] args) {

        Scanner newscanner = new Scanner(System.in);

        double feet = 0.0;
        double meter = 0.0;
        String decision;

        System.out.println("Do you want to enter in feet or meters?(F/M) ");
        decision = newscanner.nextLine();


            switch (decision) {
                case "F":
                    System.out.println("Enter feet: ");
                    feet = newscanner.nextDouble();
                    double meterConvFromFeet = footToMeter(feet);
                    System.out.println(meterConvFromFeet + "m");
                    break;
                case "M":
                    System.out.println("Enter meter: ");
                    meter = newscanner.nextDouble();
                    double feetConvFromMeter = meterToFoot(feet);
                    System.out.println(feetConvFromMeter + "ft");
                    break;
                default:
                    System.out.println("Do you want to enter in feet or meters?(F/M) ");
                    decision = newscanner.nextLine();

        }

    }
}