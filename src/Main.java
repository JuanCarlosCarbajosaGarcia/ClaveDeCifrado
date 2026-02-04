import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        StringBuilder clave = new StringBuilder();

        int letra = 0;
        int contador = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader("clave.txt"))) {
            String linea;
            while ((linea = reader.readLine()) !=null&contador<10) {
                letra = linea.charAt(linea.length()-1);

                clave.append(letra);
                contador++;
            }
        }catch (IOException e) {
            System.out.println("error al generar la Clave" + e.getMessage());
            return;
        }

        while (contador<10) {
            clave.append(letra);
            contador++;
        }
        System.out.println("la Clave generada es: " + clave);
    }
}