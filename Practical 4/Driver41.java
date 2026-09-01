import java.util.Scanner;

public class Driver41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PasswordChecker41 pc = new PasswordChecker41();

        System.out.print("Enter password: ");
        String pw = sc.nextLine();

        System.out.println("Length >= 8: " + pc.lengthRule(pw));
        System.out.println("Has Uppercase: " + pc.upperRule(pw));
        System.out.println("Has Digit: " + pc.digitRule(pw));
        System.out.println("Has Special Character: " + pc.specialRule(pw));
        System.out.println("Strength: " + pc.strength(pw));

        sc.close();
    }
}