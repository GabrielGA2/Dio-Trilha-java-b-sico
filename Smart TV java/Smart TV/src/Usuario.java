public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();;
        
        System.out.println("Canal atual:" + smartTv.canal);
        System.out.println("Volume Atual:" +smartTv.volume);
        smartTv.mudarCanal(13); 

        System.out.println("Tv está ligada?" + smartTv.ligada);
        System.out.println("Canal atual:" + smartTv.canal);
        System.out.println("Volume Atual:" + smartTv.volume);

        smartTv.ligar();
        
        System.out.println("Novo Status-> Tv está ligada?" + smartTv.ligada);
        
        smartTv.desligar();

        System.out.println("Novo Status-> Tv está ligada?" + smartTv.ligada);

    }
}
