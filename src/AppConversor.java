import java.io.IOException;
import java.util.Scanner;

public class AppConversor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== Conversor de Moneda ===");
            System.out.println("1. Dólar a Peso argentino");
            System.out.println("2. Peso argentino a Dólar");
            System.out.println("3. Dólar a Real brasileño");
            System.out.println("4. Real brasileño a Dólar");
            System.out.println("5. Dólar a Peso colombiano");
            System.out.println("6. Peso colombiano a Dólar");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            if (opcion >= 1 && opcion <= 6) {
                System.out.print("Ingrese la cantidad: ");
                double cantidad = sc.nextDouble();
                sc.nextLine(); // Limpiar buffer

                String origen = "", destino = "";

                switch (opcion) {
                    case 1: origen = "USD"; destino = "ARS"; break;
                    case 2: origen = "ARS"; destino = "USD"; break;
                    case 3: origen = "USD"; destino = "BRL"; break;
                    case 4: origen = "BRL"; destino = "USD"; break;
                    case 5: origen = "USD"; destino = "COP"; break;
                    case 6: origen = "COP"; destino = "USD"; break;
                }

                try {
                    double resultado = Conversor.convertir(cantidad, origen, destino);
                    System.out.printf("%.2f %s = %.2f %s\n", cantidad, origen, resultado, destino);
                } catch (IOException | InterruptedException e) {
                    System.out.println("Error en la conversión: " + e.getMessage());
                }
            } else if (opcion == 7) {
                System.out.println("Saliendo del programa...");
            } else {
                System.out.println("Opción inválida. Intente nuevamente.");
            }

        } while (opcion != 7);

        sc.close();
    }
}
