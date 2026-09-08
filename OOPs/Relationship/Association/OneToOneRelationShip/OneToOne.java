package OOPs.Relationship.Association.OneToOneRelationShip;




class Passport{
    private String passportNumber;
    Passport(String passportNumber){
        this.passportNumber =passportNumber;
    }

    public String getPassportNumber(){
        return passportNumber;
    }
}

class Student{
    private String name;
    private Passport passport;

    Student(String name,Passport passport)
    {
        this.name=name;
        this.passport=passport;
    }

    public void displayDetails(){
        System.out.println(name);
        System.out.println(passport.getPassportNumber());
    }
}
public class OneToOne {
    public static void main(String[] args) {
        Passport passport=new Passport("758328983509");
        Student student=new Student("sakthi", passport);
        student.displayDetails();
    }
    
}
