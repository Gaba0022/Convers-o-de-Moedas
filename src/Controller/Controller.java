package Controller;

import Models.ConversorReal;
import Models.ConversorDolar;
import Models.ConversorEuro;
import Views.View;

        

public class Controller{
    
    private ConversorReal    real;
    private ConversorEuro    euro;
    private ConversorDolar   dolar;
    private View             view;
    private double           v1,res;
    private String           n1,n2;
    
    public Controller(View view){
        this.view = view;
    }

    
    public void coversor(){
        try {
            v1 = Double.parseDouble(view.getValor().getText());
            n1 = view.getEntrada().getSelectedItem().toString();
            n2 = view.getSaida().getSelectedItem().toString();
        } 
        catch (Exception e) {
            System.out.println(e);  
        }
        switch (n1){
            case "USD - Dólar":
                dolar = new ConversorDolar();
                res = dolar.Convert(n2, v1);
                view.getResultado().setText(String.valueOf(res));
            case "BRL - Real":
                real = new ConversorReal();
                res = real.Convert(n2, v1);
                view.getResultado().setText(String.valueOf(res));
            case "EUR - Euro":
                euro = new ConversorEuro();
                res = euro.Convert(n2, v1);
                view.getResultado().setText(String.valueOf(res));
            default:
                res = 0;
                view.getResultado().setText(String.valueOf(res));
        }
    }
}
