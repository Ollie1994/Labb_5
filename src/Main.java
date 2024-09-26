public class Main {
    public static void main(String[] args) {
        TryCatch tryCatch1 = new TryCatch();
        Account account1 = new Account();
        Book book1 = new Book("The Green Mile","Steven King", "Thriller", true);
        //----------------------------------------
        User user1 = new User("Oliwer", "Lösen");
        account1.testLäggTill();


        //tester
        while (true) {
        System.out.println("Welcome! \nWould you like to login or register a new account? \n1. Login \n2. Register an account \n3. Exit \n4. print users");
        int choice =  tryCatch1.tryCatch1();
        switch(choice) { // denna ska göras om, jsut nu bara för testning
            case 1 -> book1.displayBookDetails();
            case 2 -> account1.createAccount();
            case 3 -> System.exit(0); // vil kolalr vad detta är
            case 4 -> account1.displayAllUser();

        }
        }
    }
}
