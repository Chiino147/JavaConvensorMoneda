import java.util.Map;
import java.util.Set;

public class Conversor {
    private Map<String, Double> conversion_rates;
    private String base_code;


    public void realizarConversion(double input,String moneda,String monedaConvertida){
        System.out.println(input);
        System.out.println(this.getConversion_rates().get(monedaConvertida));
        System.out.printf("Los $%.2f %s son =>> $%.2f %s\n",input,moneda,(input*this.getConversion_rates().get(monedaConvertida)),monedaConvertida);
    }
    public Set<String> obtenerMonedas(){
        return this.conversion_rates.keySet();
    }

    public String getBase_code() {
        return base_code;
    }
    public Map<String, Double> getConversion_rates() {
        //Me devuelve el array
        return conversion_rates;
    }
}
