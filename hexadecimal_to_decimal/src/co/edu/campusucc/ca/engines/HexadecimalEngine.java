package co.edu.campusucc.ca.engines;

import java.util.Date;
import java.util.Random;

public class HexadecimalEngine {
    final long id;
    final String hexa[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};

    public HexadecimalEngine() {
        System.out.println("⚡ Started Hexadecimal's Engine ⚡");
        System.out.println("👨‍💻 by hadrian..."+new Date());
        id = new Random().nextLong();
        System.out.println("🆔 "+this.id);
    }

    public boolean checkNumber(String number) {
        boolean checkOctal = true;
        for (int i = number.length()-1; i >= 0; i--){
            String digito = String.valueOf(number.charAt(i)).toUpperCase();
            if (existeEnArreglo(hexa, digito )){
                System.out.println("❌ El dato ingresado no es un numero Octal ❌");
                checkOctal = false;
                break;
            }
        }
        return checkOctal;
    }

    private boolean existeEnArreglo(String[] arreglo, String busqueda) {
        for (int x = 0; x < arreglo.length; x++) {
          if (arreglo[x] == busqueda) {
            return true;
          }
        }
        return false;
    }

    public long hexadecimalADecimal(String hexa) {
        long decimal = 0;
        int potencia = 0;
        if (checkNumber(hexa)) {
            for (int x = hexa.length() - 1; x >= 0; x--) {
                int valorActual = Character.getNumericValue(hexa.charAt(x));
                long elevado = (long) Math.pow(16, potencia) * valorActual;
                decimal += elevado;
                potencia++;
            }
        }
        return decimal;
    }
}