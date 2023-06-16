package br.com.explorandomarte.model;

public class Planalto {

    private final Integer coordenadaY;

    private final Integer coordenadaX;

    public Planalto(Integer coordenadaY, Integer coordenadaX) {
        this.coordenadaY = coordenadaY;
        this.coordenadaX = coordenadaX;
    }

    public Integer getCoordenadaY() {
        return coordenadaY;
    }

    public Integer getCoordenadaX() {
        return coordenadaX;
    }

    @Override
    public String toString() {
        return "Planalto{" +
                "coordenadaY=" + coordenadaY +
                ", coordenadaX=" + coordenadaX +
                '}';
    }
}
