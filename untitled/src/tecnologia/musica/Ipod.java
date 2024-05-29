package tecnologia.musica;

public class Ipod implements ReprodutorMusical {
    @Override
    public void tocar() {
        System.out.println("Tocando pelo tecnologia.musica.Ipod");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando pelo tecnologia.musica.Ipod");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("A música selecionada pelo tecnologia.musica.Ipod é " + musica);
    }
}
