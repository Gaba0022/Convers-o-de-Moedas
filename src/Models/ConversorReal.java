package Models;

import java.text.DecimalFormat;

public class ConversorReal extends ModelGeneric{
    double t;
    @Override
    public double Convert(String name,double x) {
        try {
            switch(name){
                case "USD - Dólar":
                    t = x * 0.18;
                    break;
                case "EUR - Euro":
                    t = x * 0.16;
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
