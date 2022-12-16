public class SmartTv{
    boolean ligada = false;
    int canal = 10;
    int volume = 50;

    public void ligarTv(){
        ligada = true;
        System.out.println("Ligando a Tv: " + ligada);
    }

    public void desligarTv(){
        ligada = false;
        System.out.println("Desligando a Tv: " + ligada);
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume: " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume: " + volume);
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Mudando o canal: " + canal);
    }

    public void aumentandoCanal(){
        canal++;
        System.out.println("Aumentando o canal: " + canal);
    }

    public void diminuindoCanal(){
        canal--;
        System.out.println("Diminuindo o canal: " + canal);
    }
}