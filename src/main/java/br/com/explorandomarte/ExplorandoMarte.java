package br.com.explorandomarte;

import br.com.explorandomarte.model.Planalto;
import br.com.explorandomarte.service.PlanaltoService;

import java.util.Scanner;

public class ExplorandoMarte {

    public static void main(String[] args) {
        Scanner planalto = new Scanner(System.in).useDelimiter("\n");
        Scanner sonda = new Scanner(System.in).useDelimiter("\n");
        Scanner sequencia =  new Scanner(System.in).useDelimiter("\n");

        System.out.println("Digite as coordenadas do planalto, separado por espaço: ");
        String coordenadasPlanalto = planalto.next();
        String coordenadasSonda = "";

        Planalto planaltoObjeto = PlanaltoService.converterArgumento(coordenadasPlanalto);

        System.out.println(planaltoObjeto);
        while (!coordenadasSonda.equals("-1")) {
            System.out.println("Digite as coordenadas da sonda separado por espaço (digite -1 para sair): ");
            coordenadasSonda = sonda.next();
            System.out.println("Digite os comandos para direcionar a sonda no planalto (sem espaços): ");
            String sequenciaComandos = sequencia.next();
            System.out.println(coordenadasSonda);
            System.out.println(sequenciaComandos);
        }
    }
}
