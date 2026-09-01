
interface CarInterface{

    // we able to access this variable but we cant change or modified 
    // by an objects 
    int doors=4;// it is a final vairable by default we can't change it but we can use it ..
    public void Start();
    public void numberOfGears();

    default void airBags(){
        System.out.println("car has 5 Airbags");
    }

    static void printVehicle(){
        System.out.println("It is a car");
    }
}

interface Sunroof{
    public void sunroof();


}


// if we implemts the interface we must be implementing the unimplement method otherwise its thrown an error
class ManualCar implements CarInterface , Sunroof{

    @Override
    public void Start(){
        airBags();
        System.out.println("Car is Started");
    }
    public void numberOfGears(){
         System.out.println("Car has 6 gears");
    }

    public void sunroof(){
        System.out.println("normal sunroof");
    }
}
class Main{
    public static void main(String[] args) {
        // we can't  able to create a object for an interface
         // CarInterface obj=new CarInterface();

         ManualCar obj=new ManualCar();//these are methods to create an objects for an interface
         
         obj.Start();
         obj.numberOfGears();
         obj.airBags();
         obj.sunroof();


         CarInterface obj1=new ManualCar();
         obj1.Start();
         obj1.airBags();
         obj1.numberOfGears();

        //  obj1.sunroof(); we cannot access it with different refernce type 
 

        //  obj1.doors=6;we cannot modified instace variable in an  interface 

        // obj1.printVehicle(); we cannot access static metods in interface  via objects 
        // ManualCar.printVehicle(); we cannot access static metods  via sub class as well



        CarInterface.printVehicle();//we can access by class only.

    }
}