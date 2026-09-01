package OOPs.StaticKeyWord;


class Calculator{
    int total;
    public static int sum(int a ,int b){
        // total=a+b; Non static member cannot use inside the static member
        return a+b;
    }
}
public class Static {
    public static void main(String[] args) {
        int result=Calculator.sum(5, 10);
        System.out.println(result);
    }
}
