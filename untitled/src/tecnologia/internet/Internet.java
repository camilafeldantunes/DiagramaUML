package tecnologia.internet;

public class Internet implements NavegadorInternet {
    @Override
    public void exibirPagina(String url) {
        System.out.println("exibir página pela internet na url: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba na internet");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando uma página na internet");
    }
}
