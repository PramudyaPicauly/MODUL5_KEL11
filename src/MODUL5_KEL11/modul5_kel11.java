package MODUL5_KEL11;

import java.util.*;

public class modul5_kel11 {

    public static void main(String[] args) {
        

        String email, password;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Email : ");
        email = input.nextLine();
        System.out.print("Password : ");
        password = input.nextLine();
        
        userService userInput = new userService( email, password );
        userInput.login();
    }
}
