public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada ?" + smartTv.ligada);
        System.out.println("Canal Atual : " + smartTv.canal);
        System.out.println("Volume Atual : " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo StatusTV -> Ligada ? " + smartTv.ligada);
        
        smartTv.desligar();
        System.out.println("Novo StatusTV -> Ligada ? " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Volume Atual : " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Volume Atual : " + smartTv.volume);

        smartTv.aumentarCanal();
        System.out.println("Canal Atual : " + smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("Canal Atual : " + smartTv.canal);

        smartTv.mudarCanal(6);
        System.out.println("Canal Atual : " + smartTv.canal);
    }
}
