import java.util.Scanner;

public class Driver42 {
    public static void main(String[] args) {

        String[] logs = {
            "10:05 alice Hello there",
            "10:06 bob How are you",
            "10:07",
            "10:08 charlie hello morning"
        };

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter keyword: ");
        String keyword = sc.nextLine();

        ChatFilter42.filter(logs, keyword);

        sc.close();
    }
}