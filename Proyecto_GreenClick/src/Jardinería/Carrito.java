package Jardinería;

public class Carrito {
	  public static String[] carrito = new String[10];
	    public static double[] cantidades = new double[10];
	    public static int carritoSize = 0;

	    public static void agregarAlCarrito(String nombre, double cantidad) {
	        for (int i = 0; i < Tienda.nombres.length; i++) {
	            if (Tienda.nombres[i].equalsIgnoreCase(nombre)) {
	                carrito[carritoSize] = nombre;
	                cantidades[carritoSize] = cantidad;
	                carritoSize++;
	                System.out.println("\nAñadido al carrito: " + cantidad + " de " + nombre);
	                return;
	            }
	        }
	        System.out.println("\nProducto no encontrado.");
	    }

	    public static void eliminarDelCarrito(String nombre) {
	        for (int i = 0; i < carritoSize; i++) {
	            if (carrito[i] != null && carrito[i].equalsIgnoreCase(nombre)) {
	                System.out.println("\nEliminando " + carrito[i] + " del carrito.");
	                for (int j = i; j < carritoSize - 1; j++) {
	                    carrito[j] = carrito[j + 1];
	                    cantidades[j] = cantidades[j + 1];
	                }
	                carrito[carritoSize - 1] = null;
	                cantidades[carritoSize - 1] = 0;
	                carritoSize--;
	                return;
	            }
	        }
	        System.out.println("\nProducto no encontrado en el carrito.");
	    }

	    public static void finalizarCompra() {
	        double total = 0;
	        System.out.println("\nResumen de compra:");
	        for (int i = 0; i < carritoSize; i++) {
	            for (int j = 0; j < Tienda.nombres.length; j++) {
	                if (carrito[i].equals(Tienda.nombres[j])) {
	                    double subtotal = Tienda.precios[j] * cantidades[i];
	                    total += subtotal;
	                    System.out.println(carrito[i] + " - " + cantidades[i] + " unidades - $" + subtotal);
	                }
	            }
	        }
	        System.out.println("Total a pagar: $" + total);
	    }
	}