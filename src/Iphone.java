public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorWeb {
    //REPRODUTOR MUSICAL
    public void tocar(){
        System.out.println("Tocando música...");
    }

    public void pausar(){
        System.out.println("Pausando música...");
    
    }
    public void selecionarMusica(String musica){
        System.out.println("Selecionando música..." + musica);
    }
    //NAVEGADOR WEB
    public void exibirPagina(String url){
        System.out.println("Exibindo página..." + url);
    }
    public void atualizarPagina(){
        System.out.println("Atualizando página...");
    }
    public void adicionarNovaAba(String url){
        System.out.println("Adicionando nova aba..." + url);
    }
    //APARELHO TELEFONICO
    public void ligar(String numero){
        System.out.println("Discando..." + numero);
    }
    public void atender(){
        System.out.println();
    }
    public void iniciarCorreioVoz(){
        System.out.println();
    }

}
