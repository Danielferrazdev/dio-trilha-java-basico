import appsCelular.iphone;

public class testePooJava {
    public static void main(String[] args) {
        iphone meuIphone = new iphone();

        // Testando métodos do iPhone
        meuIphone.tocar();
        meuIphone.pausar();

        meuIphone.selecionarMusica();

        meuIphone.ligar();
        meuIphone.atender();
        meuIphone.acionarCorreiosVoz();

        meuIphone.exibirPagina();
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();

    }
}
