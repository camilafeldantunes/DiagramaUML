package tecnologia.iphone;

import tecnologia.internet.NavegadorInternet;
import tecnologia.musica.ReprodutorMusical;
import tecnologia.telefone.AparelhoTelefonico;

public class IPhone implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico {

    @Override
    public void ligar() {
        System.out.println("Ligando pelo Iphone");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo pelo Iphone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciar correio de voz pelo Iphone");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("exibir página pelo Iphone na url: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionar nova página pelo Iphone");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página pelo Iphone");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando a música pelo Iphone");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a música pelo Iphone");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada pelo Iphone é: " + musica);
    }
}