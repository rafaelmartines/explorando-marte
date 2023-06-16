package br.com.alura.explorandomarte.model;

public enum Polos {
    W {
        @Override
        int coeficiente() {
            return -1;
        }
    },
    S {
        @Override
        int coeficiente() {
            return -1;
        }
    },
    E {
        @Override
        int coeficiente() {
            return 1;
        }
    },
    N {
        @Override
        int coeficiente() {
            return 1;
        }
    }
    ;

    abstract int coeficiente();
}
