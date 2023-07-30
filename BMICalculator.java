import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("BMI Calculator");
        System.out.println("==============");

        System.out.print("Enter your weight in kilograms: ");
        double weight = input.nextDouble();

        System.out.print("Enter your height in meters: ");
        double height = input.nextDouble();

        double bmi = calculateBMI(weight, height);
        System.out.println("Your BMI is: " + bmi);
        
        String bmiCategory = getBMICategory(bmi);
        System.out.println("BMI Category: " + bmiCategory);

        input.close();
    }

    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    public static String getBMICategory(double bmi) {
        if (bmi < 16) {
            return "Severely underweight";
        } else if (bmi >= 16 && bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 25) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 30) {
            return "Overweight";
        } else if (bmi >= 30 && bmi < 35) {
            return "Obese Class I (Moderate)";
        } else if (bmi >= 35 && bmi < 40) {
            return "Obese Class II (Severe)";
        } else {
            return "Obese Class III (Very Severe)";
        }
    }
}
