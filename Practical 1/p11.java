import java.util.Scanner;

enum coin{
    ONE,
    TWO,
    FIVE,
    TEN
}

public class p11{
    public static void main(String[] args){
        int snack =15;
        int total=0;
        Scanner sc = new Scanner(System.in);
        while(total<15){
            System.out.print("Enter Coin (ONE, TWO, FIVE, TEN): ");
            String input= sc.next().toUpperCase();
            coin c=coin.valueOf(input);
            int value = switch(c){
                case ONE -> 1;
                case TWO -> 2;
                case FIVE -> 5;
                case TEN -> 10;
            };
            total += value;
            System.out.println("Amount Paid: "+ total);
        }
        System.out.println("Change: "+ (total-snack));
        sc.close();
    }
}
