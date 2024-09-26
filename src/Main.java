public class Main {
    public static void main(String[] args) {
        TryCatch tryCatch1 = new TryCatch();
        UserMenu userMenu = new UserMenu();
        //----------------------------------------


        System.out.println("Welcome! \nWould you like to login or register a new account? \n1. Login \n2. Register an account \n3. Exit ");
        int choice =  tryCatch1.tryCatch1();
        switch(choice) {
            case 1 -> userMenu.userMenu();
            case 2 ->
            case 3 -> System.exit(0); // vil kolalr vad detta är
        }
    }
}
