package cuentas;

/**
 * Clase principal que ejecuta la operativa de la cuenta bancaria.
 * @author Andreu
 */
public class Main {

    /**
     * Método principal que inicia la ejecución del programa.
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        // Llamada al metodo operativa_cuenta con un valor float
        operativa_cuenta(2500.0f); // Puedes cambiar este valor según lo necesites
    }

    /**
     * Método que realiza operaciones sobre una cuenta bancaria.
     * @param cantidad Cantidad inicial para la cuenta.
     */
    public static void operativa_cuenta(float cantidad) {
        double saldoActual;
        CCuenta cuenta1;
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",cantidad,0);

        // Mostrar el saldo actual
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es "+ saldoActual );

        // Intenta retirar 2300 de la cuenta
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            // Captura cualquier excepción que ocurra al intentar retirar
            System.out.print("Fallo al retirar");
        }

        // Intenta ingresar 695 en la cuenta
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            // Captura cualquier excepción que ocurra al intentar ingresar
            System.out.print("Fallo al ingresar");
        }

        // Mostrar el saldo actual después de las operaciones
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual después de las operaciones es "+ saldoActual );
    }
}
