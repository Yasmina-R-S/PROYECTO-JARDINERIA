package Jardinería;

public class Ordenar {

	// FUNCIÓN PARA ORDENAR LOS PRODUCTOS SEGÚN SU PRECIO
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

     int t = precios.length; // Guardamos la cantidad total de productos en 't'.

     // Bucle anidado para recorrer todos los productos y compararlos entre sí.
     for (int i = 0; i < t - 1; i++) { // Primer bucle: controla cuántas veces recorremos la lista.
         for (int j = 0; j < t - i - 1; j++) { // Segundo bucle: compara elementos consecutivos.
             /*
              * Si 'ascendente' es "true", cambiamos si el precio actual es mayor que el siguiente.
              * Si 'ascendente' es "false", cambiamos si el precio actual es menor que el siguiente.
              */
             if ((ascendente && precios[j] > precios[j + 1]) || (!ascendente && precios[j] < precios[j + 1])) {
                 // Intercambiamos los precios.
            	// Guardamos temporalmente el precio actual en una variable auxiliar.
                 double tempPrecio = precios[j];
                 
              // Asignamos el precio del siguiente elemento a la posición actual.
                 precios[j] = precios[j + 1];
                 
              // Colocamos el precio almacenado temporalmente en la posición siguiente.
                 precios[j + 1] = tempPrecio;

                 String tempNombre = nombres[j];
                 
              // Asignamos el nombre del siguiente elemento a la posición actual.
                 nombres[j] = nombres[j + 1];
                 
                // Colocamos el nombre almacenado temporalmente en la posición siguiente.
                 nombres[j + 1] = tempNombre;
              }
          }
      }

  // Lista de productos ordenados.
     System.out.print("Productos ordenados por precio ");
     if (ascendente) {
         System.out.println("ascendente:");
     } else {
         System.out.println("descendente:");
     }

     for (int i = 0; i < t; i++) { // Recorremos los productos ya ordenados y los imprimimos.
         System.out.println(nombres[i] + " - €" + precios[i]);
     }
   }
}