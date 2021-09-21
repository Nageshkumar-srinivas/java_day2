public class BoxMain {
    public static void main(String[] args) {
        Box b1=new Box();

        b1.initialize(10,20,30);
        b1.display();
        System.out.println(b1.getVolume());

        System.out.println("After altering the length ");
        b1.setLength(11);
        b1.display();
        System.out.println(b1.getVolume());

        System.out.println("After altering the width ");
        b1.setWidth(24);
        b1.display();
        System.out.println(b1.getVolume());

        System.out.println("After altering the height ");
        b1.setHeight(32);
        b1.display();
        System.out.println(b1.getVolume());

    }
}
