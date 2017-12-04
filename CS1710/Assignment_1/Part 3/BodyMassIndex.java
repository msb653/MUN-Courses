import java.util.Scanner;
public class BodyMassIndex {
    public static void main (String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Please enter the weight in pounds: ");
        double weight=in.nextDouble();
        System.out.print("Please Enter the height in inches: ");
        double height=in.nextDouble();
        double metricWeight=weight*0.45359237;
        double metricHeight=height*0.0254;
        double bmi=metricWeight/Math.pow(metricHeight,2);
        int bmi2=(int)bmi;
        System.out.printf("Metric Weight: %10.2f", metricWeight, "kg");
        System.out.println();
        System.out.printf("Metric Height: %10.2f", metricHeight, "m");
        System.out.println();
        System.out.print("The BMI is: ");
        System.out.print(bmi2);
    }
}