# U1-Clase-SYSTEM
Clase System en JAVA pide datos por Teclado y realiza operación





     import java.io.BufferedReader; 
     import java.io.IOException;
     import java.io.InputStreamReader;                            
     public class ClaseSystemEj2 {
         public static void main(String[] args) throws IOException {
             short anoActual=2022;
             short anoNacimiento;  
         InputStreamReader isr = new InputStreamReader(System.in);
         BufferedReader br = new BufferedReader(isr);            
         System.out.println("\nIntroduce el ano de nacimiento: \n\t");
         String cad = br.readLine();                              
         anoNacimiento=Short.parseShort(cad) ;  
         int resultado=anoActual-anoNacimiento; 
         System.out.print("\nTu edad es de "+resultado+" anos.\n");
         }
     }



![alt text](https://repository-images.githubusercontent.com/541212086/ebf24049-031d-4a09-94bc-cd216ec1ff4d)
