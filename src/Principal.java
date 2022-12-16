public class Principal {
    public static void main(String[] args){
        SmartTv smartTv = new SmartTv();

        System.out.println("Estado da TV: ");
        System.out.println("Está ligada ? " + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);
        System.out.println("");
        //Chamando o método para ligar
        smartTv.ligarTv();

        //Chamando o método para mudar o canal
        smartTv.mudarCanal(19);

        //Chamando o método para aumentar o volume 3 vezes
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("");

        //Verificando a atualização do estado da Tv
        System.out.println("Estado da TV: ");
        System.out.println("Está ligada ? " + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);
    }
}
