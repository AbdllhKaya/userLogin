import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Variables have been initialized.
        String userName, password,selection, newPassword;


        //Scanner has been defined.
        Scanner ak= new Scanner(System.in);

        //Get inputs from the user
        System.out.print("Please enter your username :");
        userName = ak.nextLine();

        System.out.print("Please enter your password: ");
        password = ak.nextLine();

        //Check the correctness of the username and password.
        if (userName.equals("Abdullah") && password.equals("Ak1234")){
            System.out.print("Logged in!");
            }else {
            System.out.println("Login failed! Would you like to change your password?");
            System.out.print("Yes" + "\nNo\n");
            selection = ak.nextLine();
                if (selection.equals("Yes")){
                System.out.print("Please enter a new password :");
                newPassword = ak.nextLine();
                    if (newPassword.equals(password)){
                    System.out.print("Password could not be created, please enter another password.");
                        }else{
                            System.out.print("Password changed successfully!");
                }
            }
            else {
                System.out.print("The system login was unsuccessful!");
            }
        }
    }
}