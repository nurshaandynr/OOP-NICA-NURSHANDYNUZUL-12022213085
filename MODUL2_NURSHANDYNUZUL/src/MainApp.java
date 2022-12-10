public class MainApp {
    public static void main(String[] args) throws Exception {
        TransportasiAir tran = new TransportasiAir(4,20000);
        tran.informasi();
        tran.berlayar();
        tran.berlabu();
        System.out.println("\n");
        Sampan sa = new Sampan(20,50000, 2);
        sa.informasi();
        sa.berlayar();
        sa.berlabu();
        sa.berlabu(2);
        System.out.println("\n");
        Kapal kl = new Kapal(50,10000,"Diesel");
        kl.informasi();
        kl.berlabu();
        kl.berlayar();
        kl.berlayar(20);
    }
}
