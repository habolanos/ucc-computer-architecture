import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Conversor de decimal a binario");
        Scanner Capturar = new Scanner(System.in);
        int dividendo = 0;
        int divisor = 2;
        int cociente = 0;
        int residuo = 0;
        String resultado = "";
        String operar = "si";
        String binario = "";
        System.out.println("-------------------------------------");
        System.out.println("Ingrese el número que desea convertir📥");
        System.out.println("-------------------------------------");
        System.out.print(">");
        dividendo = Capturar.nextInt(); 
        
// Conversión
        cociente=dividendo;
        while(operar ==  "si"){
            cociente = dividendo / divisor;
            residuo = dividendo % divisor;

            if (cociente >= 2) {

            resultado = resultado + residuo;
            dividendo = cociente;
            } else {

                resultado = resultado + residuo;
                operar = "no";
            } 
                

        } 
// Ordena los números
             resultado = resultado + cociente;
                Capturar.close();
                for (int i= resultado.length() -1; i > 0 -1  ; i--) {

                    char dato = resultado.charAt(i);
                    binario = binario + dato;
                }
                System.out.println("✅El resultado es " + binario);
    }       


} 
