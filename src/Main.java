public class Main {
    public static void main(String[] args) {
        TryCatch tryCatch1 = new TryCatch();
        Book book1 = new Book("The Green Mile","Steven King", "Thriller", true);
        //----------------------------------------


        System.out.println("Welcome! \nWould you like to login or register a new account? \n1. Login \n2. Register an account \n3. Exit ");
        int choice =  tryCatch1.tryCatch1();
        switch(choice) {
            case 1 -> System.out.println("hej");
            case 2 -> System.out.println("hej");
            case 3 -> System.exit(0); // vil kolalr vad detta är
        }
    }
}
