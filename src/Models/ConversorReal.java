package Models;

public class ConversorReal extends ModelGeneric {
    @Override
    public double Convert(String name,double x) {
  
        switch(name){
            case "USD - Dólar":
                return x * 0.18;

            case "EUR - Euro":
                return x * 0.16;

            default:
                return x;
        }
    
    } 
}
