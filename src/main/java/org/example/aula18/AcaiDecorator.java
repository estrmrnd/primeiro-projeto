package org.example.aula18;

public abstract class AcaiDecorator implements  Acai {
    protected Acai acaiEmbrulhado;

        public AcaiDecorator(Acai acai) {
            this.acaiEmbrulhado = acai;
        }
}
