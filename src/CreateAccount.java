import java.util.ArrayList;

public class CreateAccount {
    TryCatch tryCatch = new TryCatch();
    ArrayList<User> users = new ArrayList<User>();

    //----------------METHODS ford user-------------
    public void createAccount () {
        System.out.println("please enter username");
        String username = tryCatch.tryCatchAccountCreation();
        System.out.println("please enter password");
        String password = tryCatch.tryCatchAccountCreation();
        users.add(new User(username,password));
        System.out.println("You have successfully created a new account with username " + username + " and password " + password);
    }
    //--------------METHODS for Lib --------------------------
    public void displayAllUser() {
        for (User user : users) {
            user.displayUserDetails();
        }
    }


}



