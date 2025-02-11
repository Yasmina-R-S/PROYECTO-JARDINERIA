package Jardinería;

public class Tienda {
	  public static String[] nombres = { "Maria Juana", "Hierba de los bosques", "La seta feliz", "El oro verde" };
	    public static String[] origenes = { "Mexico", "Andorra", "Marruecos", "Palestina" };
	    public static double[] precios = { 1.70, 4.20, 2.47, 1.33 };

	    public static void buscarPorNombre(String nombre) {
	        System.out.println("Buscando productos que contengan: " + nombre);
	        for (int i = 0; i < nombres.length; i++) {
	            if (nombres[i].toLowerCase().contains(nombre.toLowerCase())) {
	                System.out.println(nombres[i] + " - $" + precios[i] + " - Origen: " + origenes[i]);
	            }
	        }
	    }

	    public static void buscarPorOrigen(String origen) {
	        System.out.println("\nBuscando productos de: " + origen);
	        for (int i = 0; i < origenes.length; i++) {
	            if (origenes[i].equalsIgnoreCase(origen)) {
	                System.out.println(nombres[i] + " - $" + precios[i]);
	            }
	        }
	    }

	    public static void ordenarPorPrecio(boolean ascendente) {
	        for (int i = 0; i < precios.length - 1; i++) {
	            for (int j = 0; j < precios.length - i - 1; j++) {
	                if ((ascendente && precios[j] > precios[j + 1]) || (!ascendente && precios[j] < precios[j + 1])) {
	                    // Intercambiar precios
	                    double tempPrecio = precios[j];
	                    precios[j] = precios[j + 1];
	                    precios[j + 1] = tempPrecio;

	                    // Intercambiar nombres
	                    String tempNombre = nombres[j];
	                    nombres[j] = nombres[j + 1];
	                    nombres[j + 1] = tempNombre;
	                }
	            }
	        }

	        System.out.println("\nProductos ordenados por precio " + (ascendente ? "ascendente" : "descendente") + ":");
	        for (int i = 0; i < nombres.length; i++) {
	            System.out.println(nombres[i] + " - $" + precios[i]);
	        }
	    }
	}