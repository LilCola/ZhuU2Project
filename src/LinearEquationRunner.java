import java.text.DecimalFormat;import java.util.Scanner;
public class LinearEquationRunner {

    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.println("Welcome user.");
        System.out.print("\nEnter coordinate 1: ");
        String coordinate1=scan.nextLine();
        double x1=Integer.parseInt(coordinate1.substring(1,coordinate1.indexOf(",")));
        double y1=Integer.parseInt(coordinate1.substring(coordinate1.indexOf(" ")+1,coordinate1.length()-1));
        System.out.print("Enter coordinate 2: ");
        String coordinate2=scan.nextLine();
        double x2=Integer.parseInt(coordinate2.substring(1,coordinate2.indexOf(",")));
        double y2=Integer.parseInt(coordinate2.substring(coordinate2.indexOf(" ")+1,coordinate2.length()-1));
        boolean haveRationalSlope=true;
        double slope=(y2-y1)/(x2-x1);
        double yIntercept=y2-(slope*x2);
        if(x1==x2){
            haveRationalSlope=false;
        }
        if(haveRationalSlope){
            LinearEquation linearEquation1= new LinearEquation(x1,y1,x2,y2);
            System.out.println(linearEquation1.lineInfo());
            System.out.print("Enter a value for x: ");
            double xNewPoint=scan.nextDouble();
            System.out.println("\nThe point on the line is: "+linearEquation1.CoordinateForX(xNewPoint));
        }else{
            System.out.println("These points are on a vertical line: x="+x1);
        }
    }
}