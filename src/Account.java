public class Account {
    private String user_name;
    private String password;
    private int balance;



    public Account(String user_name, String password, int balance) {
        this.user_name = user_name;
        this.password = password;
        this.balance = balance;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void deposit(int amount){

        balance+=amount;
        System.out.println("New Balance :" + balance);
    }
    public void withdrawMoney(int amount){

        if ((balance - amount) < 0){
            System.out.println("You Don't Have Enough Balance");
        }
        else{
            balance-=amount;
            System.out.println("New Balance :" + balance);
        }

    }



}
