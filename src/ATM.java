import java.util.Scanner;

public class ATM {

            public void work(Account account) {
                Login login = new Login();

                Scanner scanner = new Scanner(System.in);

                System.out.println("Welcome to our bank.... ");

                System.out.println("****************************");

                System.out.println("User login  ");

                System.out.println("****************************");

                int rightoFentry = 3;

                while (true) {
                    if (login.login(account)) {
                        System.out.println(" Login successful ");
                        break;

                    } else {
                        System.out.println("Login failed...");
                        rightoFentry -= 1;
                        System.out.println(" Remaining entry rights : " + rightoFentry);
                    }

                    if (rightoFentry == 0) {
                        System.out.println(" Your login rights have expired ");
                        return;
                    }
                }


                System.out.println("*********************************");
                String transactions = "1. View Balance\n"
                        + "2. Deposit\n"
                        + "3. Withdrawal\n"
                        + "Press q to exit";
                System.out.println(transactions);
                System.out.println("**********************************");


                while (true) {
                    System.out.println("Select the action : ");
                    String transaction = scanner.nextLine();

                    if(transaction.equals("q")) {

                        break;
                    }

                    else if (transaction.equals("1")) {
                        System.out.println("Your balance  : " + account.getBalance());
                    }
                    else if (transaction.equals("2")) {

                        System.out.print("The amount you want to deposit : ");
                        int amount = scanner.nextInt();
                        scanner.nextLine();
                        account.deposit(amount);

                    } else if (transaction.equals("3")) {

                        System.out.print("The amount you want to withdraw : ");
                        int amount = scanner.nextInt();
                        scanner.nextLine();
                        account.withdrawMoney(amount);

                    } else {

                        System.out.println("Invalid Transaction....");
                    }


                }
            }

        }




