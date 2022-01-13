package Models;

public class ConversorEuro extends ModelGeneric{
    @Override
    public double Convert(String name,double x) {
        try {
            switch(name){
                case "USD - Dólar":
                    return x * 1.12;
                    
                case "BRL - Real":
                    return x * 6.28;
                
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
