import java.util.HashSet;
class JavaHashSet{
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Car 1");
        cars.add("Car 2");
        cars.add("Car 3");
        cars.add("Car 4");
        System.out.println(cars);
        cars.remove("Car 4");
        System.out.println(cars);
        System.out.println("\033[0;31m"+"Clearing..."+"\033[0m");
        System.out.println(cars);
    }
}