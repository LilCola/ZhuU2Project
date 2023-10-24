import javax.sound.sampled.Line;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Main{
    public static final DecimalFormat df=new DecimalFormat("#.##");
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter coordinate 1: ");
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
            linearEquation1.lineEquation();
            System.out.print("Enter a value for x: ");
            double xNewPoint=scan.nextDouble();
            double yValueCal=slope*xNewPoint+yIntercept;
            System.out.println("The point on the line is: ("+df.format(xNewPoint)+", "+df.format(yValueCal)+")");
        }else{
            System.out.println("These points are on a vertical line: x="+x1);
        }
    }
}