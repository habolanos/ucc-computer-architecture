package co.edu.campusucc.ca.app;

import java.util.Scanner;
import co.edu.campusucc.ca.engines.OctalEngine;

public class App {
    public static void main(String[] args) {
        String imprimir;
        long resultado;
        String numero;
        OctalEngine engine = new OctalEngine();

        Scanner capturar = new Scanner (System.in);
        System.out.println("Conversor Octal a Decimal");
        System.out.println("-----------------------------");
        System.out.println("Ingrese un número octal 📥");
        System.out.println("-----------------------------");
        
        numero = capturar.next();
        capturar.close();
                
        imprimir=engine.checkNumber(numero)?"si":"no";
        resultado = engine.octalADecimal(numero);
        
        System.out.println("-----------------------------------------");
        if (imprimir.equals("si")){
            System.out.println("✅El resultado es: " + resultado);
        }else{
            System.out.println("⛔El numero: " + numero + " No es Octal.");
        }
        System.out.println("-----------------------------------------");
    }
}
