public class Main {
    public static void main(String[] args) {
        TryCatch tryCatch1 = new TryCatch();
        CreateAccount createAccount = new CreateAccount();
        Book book1 = new Book("The Green Mile","Steven King", "Thriller", true);
        //----------------------------------------
        while (true) {
        System.out.println("Welcome! \nWould you like to login or register a new account? \n1. Login \n2. Register an account \n3. Exit \n4. print users");
        int choice =  tryCatch1.tryCatch1();
        switch(choice) {
            case 1 -> book1.displayBookDetails();
            case 2 -> createAccount.createAccount();
            case 3 -> System.exit(0); // vil kolalr vad detta är
            case 4 -> createAccount.displayAllUser();

        }
        }
    }
}
