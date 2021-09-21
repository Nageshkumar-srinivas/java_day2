public class Audi {
        private String name,fuelType;
        private int engineCapacity,noOfGears;
        private float power;
        private Tyre t;
        private MusicSystem m;


        public Audi(String name, String fuelType, int engineCapacity, int noOfGears, float power) {
            if(noOfGears<=6)
                this.noOfGears = noOfGears;
            else
                System.out.println("Invalid entry of Gear");
            this.name = name;
            this.fuelType = fuelType;
            this.engineCapacity = engineCapacity;
            this.power = power;
        }


    public MusicSystem getM() {
        return m;
    }

    public void setM(MusicSystem m) {
        this.m = m;
    }

    public Tyre getT() {
        return t;
    }

    public void setT(Tyre t) {
        this.t = t;
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

        public void gearChange(int gear)
        {
            if(gear>noOfGears)
                System.out.println("No such gear");
            else
            {
                if (gear<=noOfGears)
                    System.out.println(name+"Car has changed gear to "+gear);
                if(gear==0)
                    System.out.println("Car is slowing down");
            }
        }
        public void features(){
            System.out.println("Features of "+name+" car");
            System.out.println("------------------------");
            System.out.println("FuelType :"+fuelType);
            System.out.println("Engine Capacity :"+engineCapacity+"CC");
            System.out.println("Power :"+power);
            System.out.println("No of gears :"+noOfGears);
            System.out.println("Tyre name :"+t.getName()+" size :"+t.getSize());
            System.out.println("Music system name :"+m.getName());
            System.out.println(" No of Speakers :"+m.getNoOfSpeakers());
            System.out.println(" Size:"+m.getLcdScreenSize());
            System.out.println(" Woofers :"+m.isSubWoofers());
        }



}
