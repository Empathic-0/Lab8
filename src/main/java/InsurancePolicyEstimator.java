/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alexander
 */
public class InsurancePolicyEstimator extends javax.swing.JComponent {

  //this function takes the age as input and checks whether or not the age is a correct value, returns boolean
  public boolean validateAge(int age) throws InvalidAgeException {
     if (age < 5 || age > 110) {
       throw new InvalidAgeException("Age is invalid please enter an age between 5 and 110: ");
     }
     return true;
  }

  //this function takes valid age as input (int) and prints out the insurance policy cost, returns nothing 
  public int calculateInsurancePolicy(int age){
        int result = ((5 * age) + 300 ) ;
        return result;
  }
  
  public InsurancePolicyEstimator() {

  }
} 
