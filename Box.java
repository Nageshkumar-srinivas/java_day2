public class Box {
    private int length,width,height;

    public void initialize(int l,int w,int h){
        length=l;
        width=w;
        height=h;
    }
    public int getLength(){
        return length;
    }
    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }

    public void setLength(int length){
        this.length=length;
    }
    public void setWidth(int width){
        this.width=width;
    }
    public void setHeight(int height){
        this.height=height;
    }


    public Box(){
        System.out.println("This is constructor block");
    }
    public void display(){
        System.out.println("length"+length);
        System.out.println("width"+width);
        System.out.println("height"+height);
    }
    public int getVolume(){
        return length*width*height;
    }
}
