
public class Parallelogram{
    public static void main(String[] args) {
        for (int j = 1; j <=4; j++) {
            for (int i = 4; i >= j; i--) {
                System.out.print(" ");
            }
            for (int k = 1; k < j; k++) {
                System.out.print("* ");
            }

            for (int k = 4; k >= j; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

