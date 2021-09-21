public class Laptop {
    private int ram,hdd;
    private String processor;
    private double screensize;

    public void initialize(int r,int h,String p,double ss){
        ram=r;
        hdd=h;
        processor=p;
        screensize=ss;
    }

    public void display(){
        System.out.println("RAM of Laptop in GB: "+ram);
        System.out.println("HDD of Laptop in GB: "+hdd);
        System.out.println("Processor of Laptop is: "+processor);
        System.out.println("Screen size of Laptop is cm: "+screensize);
    }
}

