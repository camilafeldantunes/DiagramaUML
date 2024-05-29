package tecnologia.telefone;

import tecnologia.telefone.AparelhoTelefonico;

public class Telefone implements AparelhoTelefonico {
    @Override
    public void ligar() {
        System.out.println("Ligando pelo tecnologia.telefone.Telefone");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo pelo tecnologia.telefone.Telefone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz pelo tecnologia.telefone.Telefone");
    }
}
