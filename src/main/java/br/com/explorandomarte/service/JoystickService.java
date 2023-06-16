package br.com.explorandomarte.service;

import br.com.explorandomarte.model.Coordenada;
import br.com.explorandomarte.model.Planalto;
import br.com.explorandomarte.model.Polos;
import br.com.explorandomarte.model.Sonda;

public class JoystickService {
    public static Sonda mover(Planalto planalto, Sonda sonda, String sequencia) {
        char[] comando = sequencia.toCharArray();

        String pontoCardeal = sonda.getPontoCardeal();
        Integer posicaoX = sonda.getCoordenadaX();
        Integer posicaoY = sonda.getCoordenadaY();
        for (char x : comando) {
            switch (String.valueOf(x)) {
                case "L":
                    pontoCardeal = Coordenada.L.novaCoordenada(pontoCardeal);
                    break;
                case "R":
                    pontoCardeal = Coordenada.R.novaCoordenada(pontoCardeal);
                    break;
                case "M":
                    Integer coeficiente = Polos.valueOf(pontoCardeal).coeficiente();
                    if (pontoCardeal.equals("W") || pontoCardeal.equals("E")) {
                        posicaoX = posicaoX + coeficiente;
                    }
                    if (pontoCardeal.equals("N") || pontoCardeal.equals("S")) {
                        posicaoY = posicaoY + coeficiente;
                    }
                    break;
                default:
            }
        }

        return new Sonda(posicaoX, posicaoY, pontoCardeal);
    }
}
