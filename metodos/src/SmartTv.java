public class SmartTv{
    Boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
        System.out.println("A TV está ligada? " +ligada);
    }

    public void desligar(){
        ligada = false;
        System.out.println("A TV está ligada? " +ligada);
    }

    public void aumentarCanal(){
        canal ++;
        System.out.println("A TV aumentou para o canal: "+canal);
    }

    public void diminuirCanal(){
        canal --;
        System.out.println("A TV diminuiu para o canal: "+canal);
    }
    public void mudarCanal (int novoCanal){
        canal = novoCanal;
        System.out.println("A TV está no novo canal: "+canal);
    }
    public void aumentarVolume(){
        volume ++;
        System.out.println("A TV aumentou o volume para "+volume);
    }
    public void diminuirVolume(){
        volume --;
        System.out.println("A TV diminuiu o volume para "+volume);
    }
}