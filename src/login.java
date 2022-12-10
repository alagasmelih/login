import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        String userName, password, answer,newPassword;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter username: ");
        userName = input.nextLine();
        System.out.println("Enter password: ");
        password = input.nextLine();

        if((userName.equals("melihalagas")) && (password.equals("melih123"))) {
        System.out.println("Login success. ");

    }else{
        System.out.println("Wrong username or password. Do you want to reset your password ? (Yes/No): ");
        answer = input.nextLine();
        if(answer.equals("Yes")){
            System.out.println("Enter a new password: ");
            newPassword = input.nextLine();
            if(!newPassword.equals("melih123")){
                System.out.println("Password changed.");
            }else {
                System.out.println("New password cannot be the same as the old password");
            }

        }

    }
}
}
