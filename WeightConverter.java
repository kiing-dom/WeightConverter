import java.util.*;

class WeightConverter{
    public static void main(String[] args){
        double weight;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter weight in pounds ");
        weight = in.nextInt();

        weight = weight / 2.205;

        System.out.println("Weight in Kilograms = " + weight);
        
        in.close();
        
    }
}