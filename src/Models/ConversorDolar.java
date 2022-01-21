package Models;

public class ConversorDolar extends ModelGeneric{
    double t;
    @Override
    public double Convert(String name,double x) {
        try {
            switch(name){
                case "BRL - Real":
                    t = x * 5.42;
                    break;
                case "EUR - Euro":
                    t = x * 0.88;
                    break;  
                default:
                    t = x; 
                    break;
            }
        }
        catch (Exception e) {
            System.err.println(e);
            t = 0;
        }
        return t;    
    } 
}
