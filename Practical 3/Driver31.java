public class Driver31 {
    public static void main(String[] args) {

        Point31[] points = {
            new Point31(1, 2),
            new Point31(3, 4),
            new Point31(1, 2),
            new Point31(5, 6),
            new Point31(3, 4)
        };

        int distinct = 0;

        for (int i = 0; i < points.length; i++) {
            boolean found = false;

            for (int j = 0; j < i; j++) {
                if (points[i].equals(points[j])) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                distinct++;
            }
        }

        System.out.println("Distinct: " + distinct);
    }
}