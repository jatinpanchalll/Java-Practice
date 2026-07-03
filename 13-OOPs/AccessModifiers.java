public class AccessModifiers {
    public static void main(String[] args) {
        BankAccount MyAcc = new BankAccount();
        MyAcc.Username = "Jatin";
        System.out.println(MyAcc.Username);

        MyAcc.setPass("Mp09Je$600");

        // MyAcc.Password = "Mp09Je$600"; //YOU CAN NOT ACESS PRIVATE
    }
}

class BankAccount{
    String Username;
    private String Password;

    public void setPass(String pwd){
        Password = pwd;
    }
}
