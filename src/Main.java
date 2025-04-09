import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Scanner scanner = new Scanner(System.in);
        ConsultaApi consulta  = new ConsultaApi();
        var querie = consulta.RequestConversor();

        boolean termino = false;
        String  mensaje  =
                            """
                            ***************************************
                            Sea bienvenido/a al Conversor de Monedas :)
                            
                            1) Dólar =>> Peso Argentino
                            2) Peso Argentino =>> Dólar
                            3) Dólar =>> Real Brasileño
                            4) Real Brasileño =>> Dólar
                            5) Dólar =>> Peso Colombiano     
                            6) Peso Colombiano =>> Dólar
                            7) Salir
                            
                            Eliga una opción válida:
                            ***************************************
                            """;

        while (termino !=  true){
            System.out.println(mensaje);
            int input = scanner.nextInt();
            if (input != 7){
                System.out.println("Cuanto dinero quiere convertir:");
                double cantidadInput = scanner.nextDouble();
                switch (input){
                    case 1:
                        querie.realizarConversion(cantidadInput,"USD","ARS");
                        break;
                    case 2:
                        querie.realizarConversion(cantidadInput,"ARS","USD");
                        break;
                    case 3:
                        querie.realizarConversion(cantidadInput,"USD","BRL");
                        break;
                    case 4:
                        querie.realizarConversion(cantidadInput,"BRL","USD");
                        break;
                    case 5:
                        querie.realizarConversion(cantidadInput,"USD","COP");
                        break;

                    case 6:
                        querie.realizarConversion(cantidadInput,"COP","USD");
                        break;


                }
            }else {
                termino  = true;
                System.out.println("Nos vemos!!!");
            }
        }




    }
}