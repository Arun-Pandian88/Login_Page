import java.util.Scanner;

public class Login_Page {
    private static String UserName = "arunrosi88@gmail.com";
    private static String Password="ArunRosiStellaDavid";
    public static void main(String[] args) {
        System.out.println("Login Page");
        System.out.println("Enter the UserName");
        Scanner input = new Scanner(System.in);
        String UserName1 = input.nextLine();
        System.out.println("Enter the Password");
        String Password1 = input.nextLine();

        if(UserName==UserName1){
            if(UserName==Password1){
                System.out.println("Sucessfully in your Login");
            }
        }
        if(UserName!=UserName1){
            System.out.println("inCorrect the  UserName");
        }
        if(Password!=Password1){
            System.out.println("incorrect the Password");
        }




    }
}






