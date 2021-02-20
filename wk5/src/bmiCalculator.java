import java.util.Scanner;

public class bmiCalculator {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("== BMI Calculator ==");
        System.out.println("Step 1: Enter height\n" +
                "Feet:");
        double feet = keyboard.nextDouble();

        System.out.println("Inches:");
        double inches = keyboard.nextDouble();

        System.out.println("Step 2: Enter weight\n" +
                "Pounds:");
        double weight = keyboard.nextDouble();

        double convHeight = (feet * 12) + inches;

        double bmi = (weight * 703) / (convHeight * convHeight);

        if(bmi > 29.9){
            System.out.printf("BMI: %.1f, you are obese.\n", bmi);
        }
        else if(bmi <= 29.9 && bmi >= 25.0){
            System.out.printf("BMI: %.1f, you are overweight.\n", bmi);
        }
        else if(bmi >= 18.5 && bmi <= 24.9){
            System.out.printf("BMI: %.1f, you are normal.\n", bmi);
        }else{
            System.out.printf("BMI: %.1f, you are underweight.\n", bmi);
        }

    }
}
