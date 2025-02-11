package Jardinería;

public class Ordenar {

	  // MÉTODO PARA ORDENAR LOS PRODUCTOS SEGÚN SU PRECIO
    public static void ordenarPorPrecio(String[] nombres, double[] precios, boolean ascendente) {
      /*
       * Este método ordena los productos según su precio, ya sea de menor a mayor (ascendente)
       * o de mayor a menor (descendente).
       *
       * Parámetros:
       * - nombres: Array con los nombres de los productos.
       * - precios: Array con los precios de los productos.
       * - ascendente: Si es "true", ordena de menor a mayor. Si es "false", de mayor a menor.
       */

     int n = precios.length; // Guardamos la cantidad total de productos en 'n'

     // Bucle anidado para recorrer todos los productos y compararlos entre sí
     for (int i = 0; i < n - 1; i++) { // Primer bucle: controla cuántas veces recorremos la lista
         for (int j = 0; j < n - i - 1; j++) { // Segundo bucle: compara elementos consecutivos
             /*
              * Si 'ascendente' es "true", intercambiamos si el precio actual es mayor que el siguiente.
              * Si 'ascendente' es "false", intercambiamos si el precio actual es menor que el siguiente.
              */
             if ((ascendente && precios[j] > precios[j + 1]) || (!ascendente && precios[j] < precios[j + 1])) {
                 // Intercambiamos los precios usando una variable temporal
                 double tempPrecio = precios[j];
                 precios[j] = precios[j + 1];
                 precios[j + 1] = tempPrecio;

                 // Intercambiamos los nombres para que sigan correspondiendo con los precios
                 String tempNombre = nombres[j];
                 nombres[j] = nombres[j + 1];
                 nombres[j + 1] = tempNombre;
              }
          }
      }

     // Imprimimos la lista de productos ordenados
     System.out.println("Productos ordenados por precio " + (ascendente ? "ascendente" : "descendente") + ":");
     for (int i = 0; i < n; i++) { // Recorremos los productos ya ordenados e imprimimos
         System.out.println(nombres[i] + " - $" + precios[i]);
      }
   }
}