package Models;

public class ConversorEuro extends ModelGeneric{
    double t;
    @Override
    public double Convert(String name,double x) {
        try {
            switch(name){
                case "BRL - Real":
                    t = x * 6.13;
                    break;
                case "USD - Dólar":
                    t = x * 1.13;
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
