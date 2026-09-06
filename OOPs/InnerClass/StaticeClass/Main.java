// package StaticeClass;


class OuterClass{
    static int val=10;
    String name="Outerclass";

    static class InnerClass {
        public void execute(){
            System.out.println(val);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        OuterClass.InnerClass innerclass=new OuterClass.InnerClass();
        innerclass.execute();

    }
}
