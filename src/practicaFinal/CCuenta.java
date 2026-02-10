/**
 * La clase CCuenta representa una cuenta bancaria simple.
 * Permite gestionar el saldo, realizar ingresos y retiradas de dinero.
 */

package practicaFinal;

public class CCuenta {

    /**
     * El saldo actual de la cuenta bancaria.
     */

    private double dSaldo=0;

    /**
     * El método principal de la aplicación.
     * Contiene ejemplos de uso de la clase CCuenta para pruebas y depuración.
     */

    static void main() {
        // Depuracion. Se detiene siempre
        CCuenta miCuenta = new CCuenta();
        System.out.println("Saldo Incial: " + miCuenta.dSaldo + " euros");
        // Depuracion. Provoca parada por ingreso con cantidad menor de 0
        miCuenta.ingresar(-100);
        System.out.println("Saldo Incial: " + miCuenta.dSaldo + " euros");
        miCuenta.ingresar(100);
        System.out.println("Saldo tras ingreso: " + miCuenta.dSaldo + " euros");
        miCuenta.ingresar(200);
        System.out.println("Saldo tras ingreso: " + miCuenta.dSaldo + " euros");
        // Depuracion. Provoca parada con codicion de tercer ingreso
        miCuenta.ingresar(300);
        System.out.println("Saldo tras ingreso: " + miCuenta.dSaldo + " euros");
        miCuenta.retirar(50);
        System.out.println("Saldo tras retirada: " + miCuenta.dSaldo + " euros");
    }

    /**
     * Permite ingresar una cantidad de dinero en la cuenta.
     * Se valida que la cantidad no sea negativa y se actualiza el saldo.
     * @param cantidad La cantidad de dinero a ingresar.
     * @return Un código de error (0 si es exitoso, 1 si la cantidad es negativa, 2 para error de prueba específico).
     */
    public int ingresar(double cantidad) {
        int iCodErr;
        if (cantidad < 0) {
            System.out.println("No se puede ingresar una cantidad negativa");
            iCodErr = 1;
        } else if (cantidad == -3) {
            System.out.println("Error detectable en pruebas de caja blanca");
            iCodErr = 2;
        } else {
            // Depuracion. Punto de parada. Solo en el 3 ingreso
            dSaldo = dSaldo + cantidad;
            iCodErr = 0;
        }
        // Depuracion. Punto de parada cuando la cantidad  es menor de 0
        return iCodErr;
    }

    /**
     * Permite retirar una cantidad de dinero de la cuenta.
     * Se valida que la cantidad no sea negativa y que haya suficiente saldo.
     * NOTA: El saldo no se actualiza actualmente en este método.
     * @param cantidad La cantidad de dinero a retirar.
     */
    public void retirar (double cantidad) {
        if (cantidad <= 0)
        {
            System.out.println("No se puede retirar una cantidad negativa");
        }
        else if (dSaldo < cantidad)
        {
            System.out.println("No se hay suficiente saldo");
        }
        else
        {
            // Lógica para actualizar el saldo si la retirada es válida
            // dSaldo = dSaldo - cantidad; // Esto debería estar aquí
        }
    }
}