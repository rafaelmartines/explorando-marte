package br.com.alura.explorandomarte.service;

import br.com.alura.explorandomarte.model.Planalto;
import br.com.alura.explorandomarte.model.Sonda;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DirecaoServiceTest {

    @Test
    @DisplayName("Deveria converter o argumento 5 5 de coordenadas de planalto para objeto.")
    public void deveriaConverterArgumento55DeCoordenadasDePlanaltoParaObjeto() {
        Planalto planalto = PlanaltoService.converterArgumento("5 5");
        Planalto expectedPlanalto = new Planalto(5, 5);

        assertAll("planalto",
                () -> assertEquals(expectedPlanalto.getCoordenadaX(), planalto.getCoordenadaX()),
                () -> assertEquals(expectedPlanalto.getCoordenadaY(), planalto.getCoordenadaY())
        );
    }

    @Test
    @DisplayName("Deveria converter argumento 1 2 N de coordenadas da sonda para objeto")
    public void deveriaConverterArgumento12NDeCoordenadaDeSondaParaObjeto() {
        Sonda sonda = SondaService.converterArgumento("1 2 N");
        Sonda expectedSonda =  new Sonda(1, 2, "N");

        assertAll("sonda",
                () -> assertEquals(expectedSonda.getCoordenadaX(), sonda.getCoordenadaX()),
                () -> assertEquals(expectedSonda.getCoordenadaY(), sonda.getCoordenadaY()),
                () -> assertEquals(expectedSonda.getPontoCardeal(), sonda.getPontoCardeal())
        );
    }

    @Test
    public void deveriaRetornar51E() {
        Planalto planalto = PlanaltoService.converterArgumento("5 5");
        Sonda sonda = SondaService.converterArgumento("3 3 E");
        String joystick = JoystickService.mover(planalto, sonda, "MMRMMRMRRM");
    }
}
