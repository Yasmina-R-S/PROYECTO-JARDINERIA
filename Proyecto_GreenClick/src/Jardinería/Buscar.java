package Jardinería;

public class Buscar {

	// FUNCIÓN PARA BUSCAR UN PRODUCTO POR SU NOMBRE
    public static void buscarPorNombre(String[] nombres, double[] precios, String[] origenes, String nombre) {
        /*
         * Este método busca productos que contengan una palabra o parte del nombre.
         * Parámetros:
         * - String[] nombres -> Busca los nombres de los productos si estan o no.(verifica)
         * - double[] precios -> Busca los precioS de cada producto. (verifica)
         * - String[] origenes -> Busca los países o lugares de origen de cada producto. (verifica)
         * - String nombre -> Es el texto que queremos buscar dentro de los nombres. 
         */

        System.out.println("Buscando productos que contengan: " + nombre); // Buscando.

        // Recorro todos los nombres de los productos.
        for (int i = 0; i < nombres.length; i++) {
            // Convierto a minúsculas para que la búsqueda no distinga entre mayúsculas y minúsculas.
            if (nombres[i].toLowerCase().contains(nombre.toLowerCase())) {
                // Si el nombre esta, lo muestro con su precio y origen.
                System.out.println(nombres[i] + " - €" + precios[i] + " - Origen: " + origenes[i]);
            }
        }
    }

    // FUNCIÓN PARA BUSCAR UN PRODUCTO POR SU ORIGEN
    public static void buscarPorOrigen(String[] nombres, double[] precios, String[] origenes, String origen) {
        /*
         * Este método busca productos que sean de un país o lugar específico.
         * Parámetros:
         * - String[] nombres -> Lista con los nombres de los productos.(verifica)
         * - double[] precios -> Lista con los precios de cada producto. (verifica)
         * - String[] origenes -> Lista con los países o lugares de origen de los productos. (verifica)
         * - String origen -> Es el país o lugar que queremos buscar.
         */

        System.out.println("Buscando productos del origen: " + origen); // Indico qué se está buscando.

        // Recorro toda la lista de orígenes.
        for (int i = 0; i < origenes.length; i++) {
        	
            // Comparo el origen ignorando mayúsculas y minúsculas para que sea más facil.
        	
        	if (origenes[i].toLowerCase().equals(origen.toLowerCase())) {
                // Si el producto es del origen buscado, lo muestro con su precio.
                System.out.println(nombres[i] + " - €" + precios[i]);
            }
        }
    }
}