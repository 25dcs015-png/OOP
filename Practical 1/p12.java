import java.util.Scanner;

record vehicle(String number, String type){}

public class p12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bike=0,car=0,truck=0,total=0;
        while(true) {
            System.out.print("Enter Vehicle Number (or done to stop): ");
            String num = sc.next().toUpperCase();
            if(num.equalsIgnoreCase(num)) {
                break;
            }
            System.out.print("Enter Vehicle Type (bike, car, truck): ");
            String ty = sc.next().toLowerCase();
            vehicle v = new vehicle(num, ty);
            int toll = switch(v.type()) {
                case "bike" -> {
                    bike++;
                    yield 20;
                }
                case "car" -> {
                    car++;
                    yield 50;
                }
                case "truck" -> {
                    truck++;
                    yield 120;
                }
                default -> {
                    System.out.println("Invalid input...");
                    yield 0;
                }
            };
            total += toll;
        }
        String mostFrequent;

        if (bike >= car && bike >= truck) {
            mostFrequent = "bike";
        } else if (car >= bike && car >= truck) {
            mostFrequent = "car";
        } else {
            mostFrequent = "truck";
        }

        System.out.println("\nTotal Toll: " + total);
        System.out.println("Most Frequent: " + mostFrequent);

        sc.close();
    }
}