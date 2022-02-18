public class JavaClass {
    //declare instance fields
    String defaultType = "This is Default value by creat in instance fields.";
    String string1;
    int num1;
    char grade;

    public JavaClass (String parStr, int parNum) { //constructor method
        System.out.println("You were created an Object in Constructor 2");
        string1 = parStr; //look like getter in JS get ex(){return this._ex};
        num1 = parNum;
    }

    public JavaClass (String nameStr, char parChar) {
        System.out.println("You were created an Object in Constructor 2.");
        string1 = nameStr;
        grade = parChar;
    }

    // METHOD void -- completely empty
    public void sameNameMethod(String astr, int num) {
        System.out.println("You call a method that have string "+astr+" and a num "+ num);
    }
    public void sameNameMethod(String astr, double db) {
        System.out.println("You call a method that have string "+astr+" and a double "+ db);
    }

    public void sameNameMethod(){
        System.out.println("This is a no par method");
    }

    public void differenceNameMethod(String atr, int number) {
        System.out.println(atr + " " +number);
    }

    public static void main(String[] args) { //main method
        String str = "Hello World!";
        int num = 1;
        System.out.println(num + ". "+str);
    /* Running program invokes main() first 
    We create an instance => the code inside instance runs*/
        JavaClass ab = new JavaClass("Object 1 was created", 'B');
        num += 2;
    // When code inside instance finishes execution, it return to main
        System.out.print(num + ". This is locate of instance in memory");
        System.out.println(" of object 1 -ab: " +ab);
        System.out.println(ab.defaultType);
 
    /* When we initialize an object, 
    the compiler will know which constructor to use 
    because of the values we pass into it.*/
        JavaClass cd = new JavaClass("Object 2 was created", 3);
        JavaClass ef = new JavaClass("Object 3 was created", 'A');

    /**We must pas values into the constructor invocation
    IN THE SAME ORDER that they're listed in the parameters
        ERROR Object bcz values donot match types
        JavaClass err = new JavaClass('A', "Error");
     */

        ab.sameNameMethod("ab", 31);
        cd.sameNameMethod("cd", 2.1);
        ef.sameNameMethod();
        ab.differenceNameMethod("ab", 65);
 
    }
}