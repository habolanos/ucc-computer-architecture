package co.edu.campusucc.ca.engines;

public class OctalEngine {
    public OctalEngine() {
        System.out.println("⚡ Start Octal's Engine ⚡");
    }

    int octal[] = {0, 1, 2, 3, 4, 5, 6, 7};

    public boolean checkNumber(String number) {
        boolean checkOctal = true;
        for (int i = number.length()-1; i >= 0; i--){
            char dato = number.charAt(i);
            int digito = Integer.valueOf(String.valueOf(dato)).intValue();
            if (existeEnArreglo(octal, digito )){
                System.out.println("❌ El dato ingresado no es un numero Octal ❌");
                checkOctal = false;
                break;
            }
        }
        return checkOctal;
    }

    private boolean existeEnArreglo(int[] arreglo, int busqueda) {
        for (int x = 0; x < arreglo.length; x++) {
          if (arreglo[x] == busqueda) {
            return true;
          }
        }
        return false;
    }

    public long octalADecimal(String octal) {
        long decimal = 0;
        int potencia = 0;
        if (checkNumber(octal)) {
            for (int x = octal.length() - 1; x >= 0; x--) {
                int valorActual = Character.getNumericValue(octal.charAt(x));
                long elevado = (long) Math.pow(8, potencia) * valorActual;
                decimal += elevado;
                potencia++;
            }
        }
        return decimal;
    }
}