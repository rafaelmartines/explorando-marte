package br.com.explorandomarte.service;

import br.com.explorandomarte.model.Coordenada;
import br.com.explorandomarte.model.Planalto;
import br.com.explorandomarte.model.Polos;
import br.com.explorandomarte.model.Sonda;

import static java.lang.Integer.parseInt;

public class SondaService {

    public static Sonda converterArgumento(String args) {
        String[] argsList = args.split(" ", -1);
        return new Sonda(parseInt(argsList[0]), parseInt(argsList[1]), argsList[2]);
    }

    public static Sonda mover(Planalto planalto, Sonda sonda, String sequencia) {
        char[] comando = sequencia.toCharArray();

        String pontoCardeal = sonda.getPontoCardeal();
        Integer posicaoX = sonda.getCoordenadaX();
        Integer posicaoY = sonda.getCoordenadaY();
        for (char x : comando) {
            switch (String.valueOf(x)) {
                case "L" -> pontoCardeal = Coordenada.L.novaCoordenada(pontoCardeal);
                case "R" -> pontoCardeal = Coordenada.R.novaCoordenada(pontoCardeal);
                case "M" -> {
                    Integer coeficiente = Polos.valueOf(pontoCardeal).coeficiente();
                    if (pontoCardeal.equals("W") || pontoCardeal.equals("E")) {
                        posicaoX = posicaoX + coeficiente;
                    }
                    if (pontoCardeal.equals("N") || pontoCardeal.equals("S")) {
                        posicaoY = posicaoY + coeficiente;
                    }
                }
                default -> {
                }
            }
        }

        return new Sonda(posicaoX, posicaoY, pontoCardeal);
    }
}
