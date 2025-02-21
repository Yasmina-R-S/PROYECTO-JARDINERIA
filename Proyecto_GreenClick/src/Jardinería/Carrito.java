package Jardinería;

// \n se usa para hacer un salto de línea antes de imprimir el texto.

public class Carrito {
	
	// Almacena los nombres de los productos en el carrito (máximo 5 elementos).
    public static String[] carrito = new String[5];

    // Almacena las cantidades correspondientes de cada producto en el carrito.
    public static double[] cantidades = new double[5];

    // Variable que indica cuántos productos hay en el carrito..
    public static int carritoHay = 0;

     // FUNCIÓN PARA AGREGAR PRODUCTOS AL CARRITO.
	    public static void agregarAlCarrito(String nombre, double cantidad) {
	    	
	    	 for (int i = 0; i < Tienda.nombres.length; i++) {
	             // Compara el nombre ingresado con los nombres de los productos en la tienda (lista).
	             if (Tienda.nombres[i].equalsIgnoreCase(nombre)) {
	                 // Agrega el producto y su cantidad al carrito en la posición actual de 'carritoHay'.
	                 carrito[carritoHay] = nombre;
	                 cantidades[carritoHay] = cantidad;

	                 // Incrementa el tamaño del carrito para la próxima adición.
	                 carritoHay++;

	                 // Mensaje de confirmación
	                 System.out.println("Añadido al carrito: " + cantidad + " de " + nombre);
	                 return; // Sale de la función una vez que el producto ha sido agregado.
	            }
	        }
	    // Si no se encuentra el producto en la tienda, muestra un mensaje de error.
	        System.out.println("\nProducto no encontrado.");
	    }
	    
	 // FUNCIÓN PARA ELIMINAR UN PRODUCTO DEL CARRITO.
	    public static void eliminarDelCarrito(String nombre) {
	    	
	        for (int i = 0; i < carritoHay; i++) {
	        	 if (carrito[i].equalsIgnoreCase(nombre)) {
	                // Mensaje de confirmación de eliminación.
	                System.out.println("\nEliminando " + carrito[i] + " del carrito.");

	                // Desplaza los elementos restantes hacia la izquierda para rellenar el espacio vacío.
	                for (int j = i; j < carritoHay - 1; j++) {
	                    carrito[j] = carrito[j + 1];
	                    cantidades[j] = cantidades[j + 1];
	                }

	                // Elimina el último elemento después del desplazamiento.
	                carrito[carritoHay - 1] = ""; // Dejamos la posición vacía.
	                cantidades[carritoHay - 1] = 0;

	                // Reduce el tamaño del carrito.
	                carritoHay--;

	                return; // Sale del método una vez que el producto ha sido eliminado.
	            }
	        }
	        System.out.println("\nProducto no encontrado en el carrito.");
	    }

	 // FUNCIÓN PARA FINALIZAR LA COMPRA Y CALCULAR EL TOTAL.
	    public static void finalizarCompra() {

	        double total = 0; // Variable para almacenar el total de la compra.

	        System.out.println("\nResumen de compra:");

	        // Recorre los productos en el carrito.
	        for (int i = 0; i < carritoHay; i++) {
	            for (int j = 0; j < Tienda.nombres.length; j++) {
	            	
	                // Compara los productos en el carrito con los de la tienda para obtener el precio.
	                if (carrito[i].equals(Tienda.nombres[j])) {
	                	
	                    // Calcula el subtotal del producto (precio * cantidad).
	                    double subtotal = Tienda.precios[j] * cantidades[i];

	                    // Suma el subtotal al total de la compra.
	                    total += subtotal;

	                    // Muestra el producto, cantidad y subtotal.
	                    System.out.println(carrito[i] + " - " + cantidades[i] + " unidades - €" + subtotal);
	                }
	            }
	        }
	        
	        System.out.println("Total a pagar: €" + total);
	    }
	}