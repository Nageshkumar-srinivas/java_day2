public class AudiMain {
    public static void main(String[] args) {
        Tyre t=new Tyre("MRF",20);
        MusicSystem m=new MusicSystem("UBL",5,15,true);
        Audi a1=new Audi("Audi007","Diesel",2500,6,93.4f);
        a1.setT(t);
        a1.setM(m);
        a1.features();




    }
}
