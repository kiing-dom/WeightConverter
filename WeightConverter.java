import java.util.*;

class WeightConverter{
    public static void main(String[] args){
        double weight;
        // add a scanner to input the value of a weight in KG
        Scanner in = new Scanner(System.in);
        //adding a string to request the input of a value in the console
        System.out.print("Enter weight in KG ");
        //connecting the double "weight" to the scanner
        weight = in.nextInt();
        //assigning value for the weight using recursion
        weight = weight * 2.205;
        //print out the weight in pounds
        System.out.println("Weight in LBS = " + weight);
        //closed the scanner
        in.close();
        
    }
}
