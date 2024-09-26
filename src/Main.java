public class Main {
    public static void main(String[] args) {
        TryCatch tryCatch1 = new TryCatch();
        System.out.println("Welcome! \nWould you like to login or register a new account? \n1. Login \n2. Register an account \n3. Exit ");
        int choice =  tryCatch1.tryCatch1();
    }
}
