import java.util.Scanner;

class Thermostat {

    private
    
    final int Min =16;
    final int Max =30;
    static int count;
    String location;
    int temperature;

    public

    Thermostat(String l) {
        this(l,22);
    }

    Thermostat(String l,int t) {
        this.location = l;
        if(t>=Max) {
            this.temperature = Max;
        }
        else if(t<=Min) {
            this.temperature = Min;
        }
        else {
            this.temperature = t;
        }
        count++;
    }

    void raise() {
        if(temperature>=Max) {
            System.out.println("Temperature = 30(Max)");
        }
        else {
            this.temperature++;
            System.out.println("Temperature = "+temperature);
        }
    }

    void lower() {
        if(temperature<=Min) {
            System.out.println("Temperature = 16(Min)");
        }
        else {
            this.temperature--;
            System.out.println("Temperature = "+temperature);
        }
    }

    void getTemperature() {
        System.out.println("\nTemperature = "+temperature);
    }

    void getActiveCount() {
        System.out.println("count = "+count);
    }
};

public class p21 {

    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int temp;
        String loc;

        System.out.print("Enter Location (for Obj1): ");
        loc = sc.next();
        Thermostat obj1= new Thermostat(loc);
        
        System.out.print("Enter Location (for Obj2): ");
        loc = sc.next();
        System.out.print("Enter Temperature (for Obj2): ");
        temp = sc.nextInt();
        Thermostat obj2= new Thermostat(loc,temp);

        System.out.println("Raise Function:-");
        for(int i=0;i<10;i++) {
            obj1.raise();
        }
        System.out.println("Lower Function:-");
        for(int i=0;i<20;i++) {
            obj1.lower();
        }
        obj1.getTemperature();
        obj1.getActiveCount();
        sc.close();
    }
}