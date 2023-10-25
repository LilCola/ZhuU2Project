import java.text.DecimalFormat;
public class LinearEquation {
    public static final DecimalFormat df=new DecimalFormat("#.##");
    private double x1Value,y1Value,x2Value,y2Value;

    public LinearEquation(double x1, double y1,double x2,double y2){
        x1Value=x1;
        y1Value=y1;
        x2Value=x2;
        y2Value=y2;;
    }
    public double distance(){
        return(Math.sqrt(Math.pow(y2Value - y1Value, 2) + Math.pow(x2Value - x1Value, 2)));
    }
    public double slope(){
        return((y2Value - y1Value)/(x2Value - x1Value));
    }
    public String slopeFractional(){
        double num=(y2Value - y1Value);
        double denom=(x2Value - x1Value);
        if(denom<0){
            denom=Math.abs(denom);
            num=num*-1;
        }
        if(num%denom==0){
            if(slope()==1){
                return("");
            }
            return(df.format(slope()));
        }else{
            return(num+"/"+denom);
        }
    }
    public double yIntercept(){
        return(y2Value-(slope()*x2Value));
    }
    public String lineEquation(){
        if (slope()==0){
            return("The equation of the line between these points is y= "+yIntercept());
        }else{
            if(yIntercept()<0){
                if(yIntercept()==0){
                    return("The equation of the line between these points is y= "+slopeFractional()+"x");
                }
               return("The equation of the line between these points is y= "+slopeFractional()+"x-"+Math.abs(yIntercept()));
            }else{
                if(yIntercept()==0){
                    return("The equation of the line between these points is y= "+slopeFractional()+"x");
                }
                return("The equation of the line between these points is y= "+slopeFractional()+"x+ "+yIntercept());
            }
        }
    }
    public double roundedToHundredth(double toRound){
        return(Math.round((int)(toRound*1000)/1000.0));
    }
    public String CoordinateForX(double NewXVal){
        double yValueCal=slope()*NewXVal+yIntercept();
        return("("+df.format(NewXVal)+", "+df.format(yValueCal)+")");
    }
    public String lineInfo(){
        return("\nThe two points are: ("+df.format(x1Value)+", "+df.format(y1Value)+") and ("+df.format(x2Value)+", "+df.format(y2Value)+")\n"+lineEquation()+"\nThe slope of this line is: "+slope()+"\nThe y-intercept of the line is: "+yIntercept()+"\nThe distance between the two points is: "+df.format(distance())+"\n");
    }
}
