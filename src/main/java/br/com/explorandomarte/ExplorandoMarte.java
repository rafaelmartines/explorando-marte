package br.com.explorandomarte;

import br.com.explorandomarte.model.Planalto;
import br.com.explorandomarte.model.Sonda;
import br.com.explorandomarte.service.PlanaltoService;
import br.com.explorandomarte.service.SondaService;

import java.util.Scanner;

public class ExplorandoMarte {

    public static void main(String[] args) {
        String delimiter = System.getProperty("line.separator");

        Scanner planalto = new Scanner(System.in).useDelimiter(delimiter);
        Scanner sonda = new Scanner(System.in).useDelimiter(delimiter);
        Scanner sequencia =  new Scanner(System.in).useDelimiter(delimiter);

        System.out.println("Digite as coordenadas do planalto, separado por espaço: ");
        String coordenadasPlanalto = planalto.next();
        String coordenadasSonda = "";

        Planalto planaltoObjeto = PlanaltoService.converterArgumento(coordenadasPlanalto);

        String saida = planaltoObjeto.getCoordenadaX() + " " +  planaltoObjeto.getCoordenadaY() + delimiter;
        while (!coordenadasSonda.equals("-1")) {
            System.out.println("Digite as coordenadas da sonda separado por espaço (digite -1 para sair): ");
            coordenadasSonda = sonda.next();

            if (!coordenadasSonda.equals("-1")) {
                System.out.println("Digite os comandos para direcionar a sonda no planalto (sem espaços): ");
                String sequenciaComandos = sequencia.next();

                Sonda sondaObjeto = SondaService.converterArgumento(coordenadasSonda);
                Sonda novaSondaObjeto = SondaService.mover(planaltoObjeto, sondaObjeto, sequenciaComandos);
                saida = saida.concat(
                        novaSondaObjeto.getCoordenadaX().toString() + " "
                                + novaSondaObjeto.getCoordenadaY().toString() + " "
                                + novaSondaObjeto.getPontoCardeal() + delimiter
                );
            }
        }

        System.out.println(saida);
    }
}
