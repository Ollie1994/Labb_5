import java.util.Iterator;

public class User {
    private String userName;
    private String password;
    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
    //--------------- METHODS ------------------------------------
    //login
    //Meny
    //sök på bok
    //visa upp alla böcker/tillgängliga böcker
    //se lista på lånade böcker vid login och hur lång tid man har kvar på dem
    //



    public String displayUserDetails() {
        return "User" + "\nUserName: " + getUserName() + "\nPassword: " + getPassword();
    }
    public void printList () {
        String s = "";
        Iterator<User> itr = users.iterator();
        while (itr.hasNext()) {
            s = s + itr.next() + "\n";
        }
        System.out.println(s);
    }

    //------------ G & S -----------------------------------------------
    public String getUserName() {return userName;}
    public String getPassword() {return password;}


}
