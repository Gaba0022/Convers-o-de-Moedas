package Models;

public class ConversorDolar extends ModelGeneric{
    @Override
    public double Convert(String name,double x) {
        try {
            switch(name){
                case "EUR - Euro":
                    return x * 0.89;
                    
                case "BRL - Real":
                    return x * 5.61;
                
                default:
                    return x;
            }
        } 
        catch (Exception e) {
            System.err.println(e);
            return 0;
        }        

    } 
}
