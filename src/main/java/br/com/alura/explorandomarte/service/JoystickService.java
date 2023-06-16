package br.com.alura.explorandomarte.service;

import br.com.alura.explorandomarte.model.Coordenada;
import br.com.alura.explorandomarte.model.Planalto;
import br.com.alura.explorandomarte.model.Polos;
import br.com.alura.explorandomarte.model.Sonda;

public class JoystickService {
    public static String mover(Planalto planalto, Sonda sonda, String sequencia) {
        char[] comando = sequencia.toCharArray();

        for (char x : comando) {
            switch (String.valueOf(x)) {
                case "L":
                    System.out.println(Coordenada.L);
                    break;
                case "R":
                    System.out.println(Coordenada.R);
                    break;
                case "M":
                    break;
                default:

            }

        }
        return "teste";
    }
}
