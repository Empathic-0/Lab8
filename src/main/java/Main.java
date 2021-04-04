/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alexander
 */
import java.util.Scanner;


class Main {
  public static void main(String[] args) {
      System.out.print("Enter the " + "customer's age: ") ;
    Scanner keyboard = new Scanner(System.in);
    InsurancePolicyEstimator insurancePolicyEstimator = new InsurancePolicyEstimator();
   while (!keyboard.hasNextInt()) {
    String input = keyboard.next();
    System.out.println("Value : " + input + " is not a valid number.");
   }
   int age = keyboard.nextInt() ;
   
   boolean isValid = false;
    //Validate the input.
    while (!isValid)  {
      try {
        isValid = insurancePolicyEstimator.validateAge(age);
      } catch (InvalidAgeException e){
        System.out.println(e);
      } finally {
        if (!isValid) {
          age = keyboard.nextInt();
        }
      }
      
    }
    int result = insurancePolicyEstimator.calculateInsurancePolicy(age);
    System.out.println("Estimated Insurance Policy is going to cost $" + result + " per year.");
    keyboard.close();
  }  
}
