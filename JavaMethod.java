public class JavaMethod {
    //Instance fields
    final int beginCash;
    int total;
    String str = "nano or cat JavaMethod.java";

    //constructor method
    public JavaMethod(int cash){
        total = cash;
        beginCash = cash;
    }

    //The void keyword means that there is np specific output from the method
    public void methodVoidNoPar() {
        System.out.println("___________You call a method has void keyword but no parameter");
        System.out.println("You can " + str + " to see all code.");
    }

    public void methodVoid(int addCash, int subtrCash) {
        System.out.println("____________You call a method has void keyword and parameters");
        System.out.println("Before you have "+total+" dolar.");
        int after = total + addCash - subtrCash;
        total = after;
        System.out.println("Now you have "+total+" dolar.");
    }

    public double perLost(){
        double perDerease = total / beginCash;
        return perDerease; 
    }

    public String toString(){
        return "This is toString() of "+beginCash;
    }

    public static void main(String[] args) {
        JavaMethod obj1 = new JavaMethod(100);
        obj1.methodVoidNoPar();
        obj1.methodVoid(0, 2);
        double per = obj1.perLost();
        System.out.println(obj1.beginCash);
        System.out.println(obj1.total);
        System.out.println(obj1.perLost());

        System.out.println(obj1);
    }
}