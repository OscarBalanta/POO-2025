package Clase_13_Tarea;

public class Cámara {
    private String marca;
    private String modelo;

    public Cámara(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    public String getMarca () {
        return marca;
    }

    public String getModelo () {
        return modelo;
    }
    @Override
    public String toString() {
        return "Camara{" + "marca=" + marca + ", modelo=" + modelo + '}';
    }
}