package appsCelular;

public class iphone implements reprodutorMusical, aparelhoTelefonico, navegadorInternet {
    // Métodos da interface ReproduzirMusica
    public void tocar() {
        System.out.println("Reproduzindo ITUNE: ");
    }

    public void pausar() {
        System.out.println("Música pausada DO ITUNE: ");
    }

    public void selecionarMusica() {
        System.out.println("Música selecionada do ITUNES: ");
    }

    // Métodos da interface aparelhoTelefonico
    public void ligar() {
        System.out.println("Ligando PHONE: ");
    }

    public void atender() {
        System.out.println("Atendendo chamada do PHONE...");
    }

    public void acionarCorreiosVoz() {
        System.out.println("Correio de voz ativado do PHONE.");
    }

    // Métodos da interface NavegadorInternet
    public void exibirPagina() {
        System.out.println("Exibindo página no SAFIRA: ");
    }

    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada no SAFIRA.");
    }

    public void atualizarPagina() {
        System.out.println("Página atualizada no SAFIRA: ");
    }
}