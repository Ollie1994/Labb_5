import java.util.Scanner;

public class TryCatch {

    public int tryCatch1() {
        int choice = 0;
        while (choice <= 0 || choice > 3) {
            try {
                Scanner sc = new Scanner(System.in);
                choice = sc.nextInt();
                if (choice <= 0 || choice > 3) {
                    System.out.println("Wrong input, please choose between numbers 1-3!");
                }
            } catch (Exception e) {

            } finally {

            }
        }
        return choice;
    }
}
