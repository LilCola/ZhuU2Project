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
        return(num+"/"+denom);
    }
    public double yIntercept(){
        return(y2Value-(slope()*x2Value));
    }
    public String lineEquation(){
        if (slope()==0){
            return("y= "+yIntercept());
        }else{
            if(yIntercept()<0){
               return("y= "+slopeFractional()+"x-"+Math.abs(yIntercept()));
            }else{
                return("y= "+slopeFractional()+"x+ "+yIntercept());
            }
        }
    }
}
