import java.util.Scanner;
public class Main{
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
        System.out.println("The two points are: "+coordinate1+" and "+coordinate2);
        double slope=(y2-y1)/(x2-x1);

        System.out.println("The equation of the line between these points is: y= "+);
    }
}