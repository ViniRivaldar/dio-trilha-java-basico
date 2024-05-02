public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.ligar();
        smartTv.desligar();
        smartTv.ligar();

        System.out.println("Canal atual: "+smartTv.canal);
        System.out.println("Volume atual: "+smartTv.volume);

        
        smartTv.aumentarCanal();

        smartTv.diminuirCanal();

        smartTv.mudarCanal(2);

        smartTv.aumentarVolume();

        smartTv.diminuirVolume();
    }
}
