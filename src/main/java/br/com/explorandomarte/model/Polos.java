package br.com.explorandomarte.model;

public enum Polos {
    W {
        @Override
        public int coeficiente() {
            return -1;
        }
    },
    S {
        @Override
        public int coeficiente() {
            return -1;
        }
    },
    E {
        @Override
        public int coeficiente() {
            return 1;
        }
    },
    N {
        @Override
        public int coeficiente() {
            return 1;
        }
    }
    ;

    public abstract int coeficiente();
}
