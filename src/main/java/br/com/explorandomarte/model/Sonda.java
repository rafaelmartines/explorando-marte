package br.com.alura.explorandomarte.model;

public class Sonda {
    private final Integer coordenadaX;

    private final Integer coordenadaY;

    private final String pontoCardeal;

    public Sonda(Integer coordenadaX, Integer coordenadaY, String pontoCardeal) {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        this.pontoCardeal = pontoCardeal;
    }

    public Integer getCoordenadaX() {
        return coordenadaX;
    }

    public Integer getCoordenadaY() {
        return coordenadaY;
    }

    public String getPontoCardeal() {
        return pontoCardeal;
    }

    @Override
    public String toString() {
        return "Sonda{" +
                "coordenadaX=" + coordenadaX +
                ", coordenadaY=" + coordenadaY +
                ", pontoCardeal='" + pontoCardeal + '\'' +
                '}';
    }
}
