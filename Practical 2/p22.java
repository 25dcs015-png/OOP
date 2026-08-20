import java.util.Scanner;

class CinemaShow {

    private

    String title;
    int seatsAvailable;
    final int capacity;
    static int totalBooked = 0;

    public

    CinemaShow(String t) {
        this(t, 100);
    }

    CinemaShow(String t, int c) {
        this.title = t;
        this.capacity = c;
        this.seatsAvailable = c;
    }

    boolean book(int n) {

        if (n <= seatsAvailable) {
            seatsAvailable -= n;
            totalBooked += n;
            return true;
        }
        else {
            return false;
        }
    }

    void cancel(int n) {

        int booked = capacity - seatsAvailable;

        if (n > booked) {
            n = booked;
        }

        seatsAvailable += n;
        totalBooked -= n;
    }

    void getSeatsAvailable() {
        System.out.println("Seats Available = " + seatsAvailable);
    }

    static void getTotalBooked() {
        System.out.println("Total Booked Seats = " + totalBooked);
    }
};

public class p22 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String title;
        int capacity;
        int seats;

        System.out.print("Enter Show Title (for Obj1): ");
        title = sc.nextLine();
        CinemaShow obj1 = new CinemaShow(title);

        System.out.print("Enter Show Title (for Obj2): ");
        title = sc.nextLine();

        System.out.print("Enter Capacity (for Obj2): ");
        capacity = sc.nextInt();

        CinemaShow obj2 = new CinemaShow(title, capacity);
        
        System.out.print("\nEnter seats to Book in Obj1: ");
        seats = sc.nextInt();

        if (obj1.book(seats)) {
            System.out.println("Booking Successful");
        }
        else {
            System.out.println("Booking Failed");
        }

        obj1.getSeatsAvailable();

        System.out.print("\nEnter seats to Cancel in Obj1: ");
        seats = sc.nextInt();

        obj1.cancel(seats);
        System.out.println("Cancellation Successful");
        obj1.getSeatsAvailable();

        System.out.print("\nEnter seats to Book in Obj2: ");
        seats = sc.nextInt();

        if (obj2.book(seats)) {
            System.out.println("Booking Successful");
        }
        else {
            System.out.println("Booking Failed");
        }

        obj2.getSeatsAvailable();

        System.out.print("\nEnter seats to Cancel in Obj2: ");
        seats = sc.nextInt();

        obj2.cancel(seats);
        System.out.println("Cancellation Successful");
        obj2.getSeatsAvailable();

        System.out.println();
        CinemaShow.getTotalBooked();

        sc.close();
    }
}