import tecnologia.internet.Internet;
import tecnologia.iphone.IPhone;
import tecnologia.musica.Ipod;
import tecnologia.telefone.Telefone;

public class Main {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone();
        Ipod ipod = new Ipod();
        Telefone telefone = new Telefone();
        Internet internet = new Internet();

        // O objeto Iphone implementa todas as interfaces, por isso
        // ele consegue ter todas as funcionalidades
        iPhone.ligar();
        iPhone.atender();
        iPhone.selecionarMusica("Exclusividade");
        iPhone.tocar();
        iPhone.exibirPagina("www.paginateste.com.br");
        iPhone.atualizarPagina();

        // O objeto tecnologia.musica.Ipod implementa só a música, então ele não consegue
        // ligar nem atender, por exemplo.
        ipod.selecionarMusica("Sincerão");
        ipod.pausar();
        ipod.tocar();

        //ipod.ligar();
        // essa chamada do método dá erro, pois o tecnologia.musica.Ipod só
        // cosegue chamar os métodos do tecnologia.musica.ReprodutorMusical


        // O objeto tecnologia.telefone.Telefone implementa só o telefone, então ele não consegue
        // atualizarPágina, nem escolher o site, por exemplo.
        telefone.atender();
        telefone.ligar();

        // O objeto tecnologia.internet.Internet implementa só o Navegador tecnologia.internet.Internet, então ele não consegue
        // nem ligar, nem atender, por exemplo.
        internet.exibirPagina("www.paginateste.com.br");
        internet.adicionarNovaAba();






    }
}
