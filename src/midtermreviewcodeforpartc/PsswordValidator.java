package midtermreviewcodeforpartc;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jonathan
 */
public class PsswordValidator {
     String passwords="";
    public void password(){
       
         Scanner sc = new Scanner(System.in);
        boolean validPassword=false;
       while(!validPassword){
        System.out.println("Passwords must have at least 8 characters");
        System.out.println("Passwords must have at least one special character");
        System.out.println("Please enter your desired password:"); 
        passwords = sc.nextLine();
        int specialCharCount=0;
        for(int i=0;i<passwords.length(); i++)
        {
        if(!(Character.isLetterOrDigit(passwords.charAt(i))))
        {
            specialCharCount++;
        }
        if(specialCharCount>0 &&passwords.length()>7){
            validPassword=true;
        }
    }
    }
    }
    public String output(){
        return passwords;
    }
 
}
     