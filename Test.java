// Import statement:
import java.util.ArrayList;
public class Test {

  public static void main(String[] args) {
    ArrayList<Integer> inte = new ArrayList<Integer>();
    inte.add(3);
    inte.add(5);
    inte.add(7);
    inte.add(8);
    inte.add(2);
    for (int num : inte){
      if (num > 6) {
        System.out.println("Greater than 6");
      } else {
        System.out.println("What");
      }
    };
    JavaBeginer bal = new JavaBeginer("Tuong",21 ,23042.23);
    bal.setBalance(32.42);
  }

}  