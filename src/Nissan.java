public class Nissan extends Car{


    public Nissan(String name, String carDesignerName, int year, double volume, int horsePower, CarDeveloper carDeveloper, TypeOfFuel typeOfFuel) {
        super(name, carDesignerName, year, volume, horsePower, carDeveloper, typeOfFuel);
    }

    @Override
    public void maxSpeed() {
        super.maxSpeed(260);
    }
}

