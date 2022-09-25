package daw120.claseSystem;
import java.io.BufferedReader;    // hace falta importar estos paquetes
import java.io.IOException;
import java.io.InputStreamReader; //estos import se añaden automaticos al añadir 
                                  // las clases de java (**)
public class ClaseSystem {
    public static void main(String[] args) throws IOException {
        
        // short anoActual;  declaradas, tipo short
        // short anoNacimiento;
        short anoActual=2022; // le damos valor al valor1
        short anoNacimiento;  // solo declaramos, pues el valor lo mete el user...
        
    //dos clases:
    InputStreamReader isr = new InputStreamReader(System.in); // las clases de java (**)
    BufferedReader br = new BufferedReader(isr);              // las clases de java (**)
    
    // ENTRADA:
    System.out.println("\nIntroduce el ano de nacimiento: \n\t"); // PIDE DATOS POR CONSOLA,
    String cad = br.readLine();                                // POR el teclado..
    
    anoNacimiento=Short.parseShort(cad) ;  // clas Short con MAY.. llamamos al Pharse.short..
    int resultado=anoActual-anoNacimiento; // esta es la operacion que resta años
    
    // SALIDA:
    System.out.print("\nTu edad es de "+resultado+" anos.\n"); // (saca el calculo de la edad actual desde la fecha..)
    }
}
