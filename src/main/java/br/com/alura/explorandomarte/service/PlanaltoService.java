package br.com.alura.explorandomarte.service;

import br.com.alura.explorandomarte.model.Planalto;

import static java.lang.Integer.parseInt;

public class PlanaltoService {
    public static Planalto converterArgumento(String args) {
        String[] coordenadas = args.split(" ", -1);
        return new Planalto(parseInt(coordenadas[0]), parseInt(coordenadas[1]));
    }
}
