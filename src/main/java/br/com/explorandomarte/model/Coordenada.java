package br.com.explorandomarte.model;

public enum Coordenada {

    L {
        @Override
        String novaCoordenada(String polo) {
            String novoPolo = "";
            switch (polo) {
                case "E" -> novoPolo = "N";
                case "N" -> novoPolo = "W";
                case "W" -> novoPolo = "S";
                case "S" -> novoPolo = "E";
            }
            return novoPolo;
        }
    },
    R {
        @Override
        String novaCoordenada(String polo) {
            String novoPolo = "";
            switch (polo) {
                case "E" -> novoPolo = "S";
                case "S" -> novoPolo = "W";
                case "W" -> novoPolo = "N";
                case "N" -> novoPolo = "E";
            }
            return novoPolo;
        }
    };

    abstract String novaCoordenada(String polo);
}
