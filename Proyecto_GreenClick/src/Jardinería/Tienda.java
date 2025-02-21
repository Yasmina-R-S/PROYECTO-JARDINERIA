package Jardinería;

public class Tienda {
	
   // Listado de productos disponibles en la tienda.
	  public static String[] nombres = { "Maria Juana", "Hierba de los bosques", "La seta feliz", "El oro verde", "PP"};
	  
   // De dónde viene cada producto.
	  public static String[] origenes = { "Mexico", "Andorra", "Marruecos", "Palestina" };
	  
   // Los precios de cada producto, en el mismo orden que los nombres.
	  public static double[] precios = { 1.70, 4.20, 2.47, 1.33 };

	// FUNCIÓN PARA BUSCAR PRODUCTOS POR NOMBRE
	   public static void buscarPorNombre(String nombre) {
	        System.out.println("\nBuscando productos que contengan: " + nombre);
	        
	        for (int i = 0; i < nombres.length; i++) {
	        	
	        // Si el nombre del producto esta, lo mostramos.
	        	if (nombres[i].equalsIgnoreCase(nombre)) {
	                System.out.println(nombres[i] + " - €" + precios[i] + " - Origen: " + origenes[i]);
	            }
	        }
	    }

	 // FUNCIÓN PARA BUSCAR PRODUCTOS POR ORIGEN.
	    public static void buscarPorOrigen(String origen) {
	        System.out.println("\nBuscando productos de: " + origen);
	        
	        for (int i = 0; i < origenes.length; i++) {
	        	
	            if (origenes[i].equalsIgnoreCase(origen)) {
	                System.out.println(nombres[i] + " - €" + precios[i]);
	            }
	        }
	    }
	    
     // FUNCIÓN PARA ORDENAR LOS PRODUCTOS SEGÚN SU PRECIO.
	    public static void ordenarPorPrecio(boolean ascendente) {
	    	/*
	         * Si `ascendente == true`, ordena de más barato a más caro.
	         * Si `ascendente == false`, los pone del más caro al más barato.
	         */	
	    
	        for (int i = 0; i < precios.length - 1; i++) {
	            for (int j = 0; j < precios.length - i - 1; j++) {
	            	
	            // Comprobamos si tenemos que intercambiar (depende de si ordenamos asc o desc).
	                if ((ascendente && precios[j] > precios[j + 1]) || (!ascendente && precios[j] < precios[j + 1])) {
	                    // Intercambiar precios.
	                    double tempPrecio = precios[j];
	                    precios[j] = precios[j + 1];
	                    precios[j + 1] = tempPrecio;

	                    // Intercambiar nombres.
	                    String tempNombre = nombres[j];
	                    nombres[j] = nombres[j + 1];
	                    nombres[j + 1] = tempNombre;
	                }
	            }
	        }
	        
	     // Lista ordenada.
	        System.out.println("\nProductos ordenados por precio ");
	        if (ascendente) {
	            System.out.println("ascendente:");
	        } else {
	            System.out.println("descendente:");
	        }
	        
	     // Reviso la lista de productos ya ordenados e imprimo cada uno con su precio.
	        for (int i = 0; i < nombres.length; i++) {
	            System.out.println(nombres[i] + " - €" + precios[i]);
	        }
	  }
}




