import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner capturar = new Scanner (System.in);
        System.out.println("Conversor Binario a Decimal");
        System.out.println("-----------------------------");
        System.out.println("Ingrese un número binario 📥");
        System.out.println("-----------------------------");
        String numero = capturar.next();
        int exponente = 0;
        double resultado = 0;
        double operacion = 0;
        String imprimir = "si";
        
        for (int i = numero.length()-1; i >= 0; i--){

            char dato = numero.charAt(i);
            String digito = String.valueOf(dato);

            operacion = Math.pow(2, exponente);

            if (digito.equals("1")){
            resultado = resultado + operacion;
            exponente ++;


            } else if (digito.equals("0")) {
                exponente ++;

            } else {
                imprimir = "no";
                System.out.println("-----------------------------------------");
                System.out.println("❌ El dato ingresado no es un numero binario ❌");
                System.out.println("-----------------------------------------");
            }
                
        }
                if (imprimir.equals("si")){
                    System.out.println("-----------------------------------------");
                    System.out.println("✅El resultado es: " + resultado);
                    System.out.println("-----------------------------------------");
                }
                capturar.close();
                
    }
}
