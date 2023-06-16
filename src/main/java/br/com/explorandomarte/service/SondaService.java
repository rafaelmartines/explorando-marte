package br.com.explorandomarte.service;

import br.com.explorandomarte.model.Planalto;
import br.com.explorandomarte.model.Sonda;

import static java.lang.Integer.parseInt;

public class SondaService {

    public static Sonda converterArgumento(String args) {
        String[] argsList = args.split(" ", -1);
        return new Sonda(parseInt(argsList[0]), parseInt(argsList[1]), argsList[2]);
    }
}
