public class Punto1 {
    public static void main(String[] args) {
        
        
        double d1 = 42.0, d2 = 58.5, d3 = 37.2;
        double t1 = 0.9, t2 = 1.4, t3 = 0.8;
        double l1 = 5.1, l2 = 6.9, l3 = 4.3;
        double precioLitro = 1.35;
        double masaCargaKg = 1200;
        double largo = 2.0, ancho = 1.2, alto = 1.1;
        double p1 = 2.5, p2 = 3.0, p3 = 2.0;
        double deprecPorKm = 0.08;
        double volCamionM3 = 10.0;
        double fCO2 = 2.68;
        double galPorLitro = 0.264172;

        // Mostrar en pantalla (más corto)
        System.out.println("Distancias: " + d1 + ", " + d2 + ", " + d3);
        System.out.println("Tiempos: " + t1 + ", " + t2 + ", " + t3);
        System.out.println("Combustible: " + l1 + ", " + l2 + ", " + l3);
        System.out.println("Precio del litro: " + precioLitro);
        System.out.println("Masa carga (kg): " + masaCargaKg);
        System.out.println("Dimensiones (m): " + largo + " x " + ancho + " x " + alto);
        System.out.println("Peajes: " + p1 + ", " + p2 + ", " + p3);
        System.out.println("Depreciación/km: " + deprecPorKm);
        System.out.println("Volumen camión (m3): " + volCamionM3);
        System.out.println("Factor CO2: " + fCO2);
        System.out.println("Galones por litro: " + galPorLitro);
    }
}