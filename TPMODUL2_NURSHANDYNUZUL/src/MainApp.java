public class MainApp {
    public static void main(String[] args) throws Exception {
        Perangkat bo = new Perangkat("Adata", 2, 1.80F);
        bo.informasi();
        System.out.print("\n");

        Laptop lapt = new Laptop("Seagate", 8, 2.40F, true);
        lapt.informasi();
        lapt.bukaGame( "Dota 2");
        lapt.kirimEmail( "niceyuk@gmail.com");
        lapt.kirimEmail( "annarji@gmail.com", "rusmangc@gmail.com");
        System.out.print("\n");

        Handphone phone = new Handphone("Sandisk",  3,  2.20F, false);
        phone.informasi();
        phone.telfon(628122122);
        phone.kirimSMS(62852112);
        phone.kirimSMS(628121212,629292211);
    }
}
