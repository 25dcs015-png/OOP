public class Driver32 {
    public static void main(String[] args) {

        Card32[] cards = new Card32[10];
        int size = 0;

        Card32[] input = {
            new Card32("Ace", "Spades"),
            new Card32("King", "Hearts"),
            new Card32("Queen", "Diamonds"),
            new Card32("Ace", "Spades"),
            new Card32("Jack", "Clubs")
        };

        for (int i = 0; i < input.length; i++) {
            boolean duplicate = false;

            for (int j = 0; j < size; j++) {
                if (input[i].equals(cards[j])) {
                    System.out.println("Duplicate found: " + input[i]);
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                cards[size] = input[i];
                size++;
            }
        }
    }
}