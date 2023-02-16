public class Car {
    private String name;
    private String carDesignerName;
    private int year;
    private double volume;
    private int horsePower;
    private CarDeveloper carDeveloper;
    private TypeOfFuel typeOfFuel;

    public Car(String name, String carDesignerName, int year, double volume, int horsePower, CarDeveloper carDeveloper, TypeOfFuel typeOfFuel) {
        this.name = name;
        this.carDesignerName = carDesignerName;
        this.year = year;
        this.volume = volume;
        this.horsePower = horsePower;
        this.carDeveloper = carDeveloper;
        this.typeOfFuel = typeOfFuel;
    }

    public String getName() {
        return name;
    }
    public String getCarDesignerName() {
        return carDesignerName;
    }
    public int getYear() {
        return year;
    }
    public double getVolume() {
        return volume;
    }
    public int getHorsePower() {
        return horsePower;
    }
    public CarDeveloper getCarDeveloper() {
        return carDeveloper;
    }
    public TypeOfFuel getCarEngine() {
        return typeOfFuel;
    }
    public void maxSpeed(){
        System.out.println("минимальная скорость машины: 60 км/час");
    }
    public final void maxSpeed(int maxSpeed){
        System.out.println("Макс. скорость данной машины (мощность двигателя):"+maxSpeed);
        if (maxSpeed<0){
            System.out.println("машина не может ехать с обратной скоростью!");
        }
    }
    public String getInfo(){
        return "Name: "+this.name+
                "\nCar designed by:"+carDesignerName+
                "\nCar year of release: "+year+
                "\nCar engine volume: "+volume+
                "\nCar horse power: "+horsePower+
                "\nCar developer name: "+carDeveloper+
                "\nCar name of engine:  "+ typeOfFuel;
    }



}

