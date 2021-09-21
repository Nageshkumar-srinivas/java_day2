public class Car {
    private String name,fuelType;
    private int engineCapacity,noOfGears;
    private float power;


    public Car(String name, String fuelType, int engineCapacity, int noOfGears, float power) {
        this.name = name;
        this.fuelType = fuelType;
        this.engineCapacity = engineCapacity;
        this.noOfGears = noOfGears;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int getNoOfGears() {
        return noOfGears;
    }

    public void setNoOfGears(int noOfGears) {
        this.noOfGears = noOfGears;
    }

    public float getPower() {
        return power;
    }

    public void setPower(float power) {
        this.power = power;
    }

    public void accelerate(){
        System.out.println(name+"Car is accelerating...");
    }
    public void changeGear(){
        System.out.println(name+"Car is changing gear...");
    }
    public void steer(){
        System.out.println(name+"Car is changing directions...");
    }
    public void applyBrake(){
        System.out.println(name+"Car is slowing down/stopping ...");
    }
    public void features(){
        System.out.println("Features of "+name+" car");
        System.out.println("------------------------");
        System.out.println("FuelType :"+fuelType);
        System.out.println("Engine Capacity :"+engineCapacity+"CC");
        System.out.println("Power :"+power);
        System.out.println("No of gears :"+noOfGears);

    }

}
