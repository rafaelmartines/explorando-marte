package br.com.explorandomarte.service;

import br.com.explorandomarte.model.Planalto;
import br.com.explorandomarte.model.Sonda;
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
    @DisplayName("Deveria retornar coordenada da sonda em 1 3 N")
    public void deveriaRetornar13N() {
        Planalto planalto = PlanaltoService.converterArgumento("5 5");
        Sonda sonda = SondaService.converterArgumento("1 2 N");
        Sonda novaPosicaoSonda = JoystickService.mover(planalto, sonda, "LMLMLMLMM");
        Sonda expectedNovaPosicaSonda = new Sonda(1, 3, "N");

        assertAll("sonda",
                () -> assertEquals(expectedNovaPosicaSonda.getCoordenadaX(), novaPosicaoSonda.getCoordenadaX()),
                () -> assertEquals(expectedNovaPosicaSonda.getCoordenadaY(), novaPosicaoSonda.getCoordenadaY()),
                () -> assertEquals(expectedNovaPosicaSonda.getPontoCardeal(), novaPosicaoSonda.getPontoCardeal())
        );
    }

    @Test
    @DisplayName("Deveria retornar coordenada da sonda em 5 1 E")
    public void deveriaRetornar51E() {
        Planalto planalto = PlanaltoService.converterArgumento("5 5");
        Sonda sonda = SondaService.converterArgumento("3 3 E");
        Sonda novaPosicaoSonda = JoystickService.mover(planalto, sonda, "MMRMMRMRRM");
        Sonda expectedNovaPosicaSonda = new Sonda(5, 1, "E");

        assertAll("sonda",
                () -> assertEquals(expectedNovaPosicaSonda.getCoordenadaX(), novaPosicaoSonda.getCoordenadaX()),
                () -> assertEquals(expectedNovaPosicaSonda.getCoordenadaY(), novaPosicaoSonda.getCoordenadaY()),
                () -> assertEquals(expectedNovaPosicaSonda.getPontoCardeal(), novaPosicaoSonda.getPontoCardeal())
        );
    }
}
