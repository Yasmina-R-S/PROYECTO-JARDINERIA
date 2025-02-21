package Jardinería;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);  // Se crea un objeto 'scanner' para leer datos introducidos por el usuario.
	  int opcion = 0;
  
	 // Este bucle 'while' va a seguir ejecutándose hasta que el usuario elija la opción de salir (que es la opción 8).
	  while (opcion != 8) {
	      System.out.println("Menú");
	      System.out.println("1. Buscar por nombre");
	      System.out.println("2. Buscar por origen");
	      System.out.println("3. Ordenar por precio (menor a mayor)");
          System.out.println("4. Ordenar por precio (mayor a menor)");
	      System.out.println("5. Agregar producto al carrito");
	      System.out.println("6. Eliminar producto del carrito");
	      System.out.println("7. Finalizar compra");
	      System.out.println("8. Salir");
	      System.out.print("Seleccione una opción: ");
	            
	      opcion = scanner.nextInt();
	      scanner.nextLine();  
	      
	   // Aquí estamos comprobando la opción seleccionada por el usuario.
	      if (opcion == 1) {  // Si elige la opción 1 (Buscar por nombre).
	          System.out.print("Ingrese el nombre a buscar: ");
	          String nombre = scanner.nextLine();  // Le pedimos al usuario el nombre que quiere buscar.
	          Tienda.buscarPorNombre(nombre);// Llamamos a la función que busca productos por nombre en la tienda.
	                
	      } else if (opcion == 2) {  // Si elige la opción 2 (Buscar por origen)
              System.out.print("Ingrese el origen a buscar: ");
              String origen = scanner.nextLine();  // Le pedimos al usuario que ingrese el origen del producto.
              Tienda.buscarPorOrigen(origen);  // Llamamos a la función que busca productos por origen.
              
          } else if (opcion == 3) {  // Si elige la opción 3 (Ordenar por precio de menor a mayor)
              Tienda.ordenarPorPrecio(true);  // Llamamos a la función para ordenar los productos por precio de menor a mayor.
              
          } else if (opcion == 4) {  // Si elige la opción 4 (Ordenar por precio de mayor a menor)
              Tienda.ordenarPorPrecio(false);  // Llamamos a la función para ordenar los productos por precio de mayor a menor.
              
          } else if (opcion == 5) {  // Si elige la opción 5 (Agregar producto al carrito)
              System.out.print("Ingrese el nombre del producto: ");
              String prod = scanner.nextLine();  // Le pedimos al usuario el nombre del producto que quiere agregar.
              
              System.out.print("Ingrese la cantidad: ");
              double cant = scanner.nextDouble();  
              Carrito.agregarAlCarrito(prod, cant);  // Llamamos a la función para agregar el producto al carrito.
              
          } else if (opcion == 6) {  // Si elige la opción 6 (Eliminar producto del carrito)
              System.out.print("Ingrese el nombre del producto para eliminar: ");
              String eliminar = scanner.nextLine();  // Le pedimos al usuario el nombre del producto que quiere eliminar.
              Carrito.eliminarDelCarrito(eliminar);  // Llamamos a la función para eliminar ese producto del carrito.
              
          } else if (opcion == 7) {  // Si elige la opción 7 (Finalizar compra)
              Carrito.finalizarCompra();  // Llamamos a la función que finaliza la compra.
              
          } else if (opcion == 8) {  // Si elige la opción 8 (Salir)
              System.out.println("Saliendo..");  // Le mostramos un mensaje de despedida.
              
          } else {  // Si el usuario escribe una opción que no está en el menú.
              System.out.println("Opción no válida.");  // Le mostramos un mensaje de error.
          }
      }
   }
}