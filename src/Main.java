public class Main {
    public static void main(String[] args) {
        CarDeveloper carDeveloperMe = new CarDeveloper("ME");
        Car objectA = new Car("MY CAR ", " DESIGNED BY ME ", 2049, 1.5, 500,
                carDeveloperMe, TypeOfFuel.REGULAR);
        System.out.println(objectA.getInfo());

        System.out.println();
        CarDeveloper carDeveloper= new CarDeveloper("Yoshisuke Ayukawa");
        Nissan objectB = new Nissan("Nisssan Silvia S15","Albrecht fon Gertz",1999,2.0,
                250,carDeveloper, TypeOfFuel.PREIMIUM);
        System.out.println(objectB.getInfo());

        System.out.println();
        CarDeveloper carDeveloper1= new CarDeveloper("Kiichiro Toyoda");
        Toyota objectC= new Toyota("Mark || Grande ","Toyota",2000,2.5,200,carDeveloper1
                ,TypeOfFuel.PREIMIUM);
        System.out.println(objectC.getInfo());


    }
}