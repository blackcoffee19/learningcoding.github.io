public class JavaBeginer {
    private String name;
    private int num;
    private double balance;

    public JavaBeginer(String enterName, int enterDay, double enterMoney) {
        this.name = enterName;
        this.num = enterDay;
        this.balance = enterMoney;
    }
    public String getName(){
        return this.name;
    }
    public double getBalance(){
        return this.balance;
    }
    public void setBalance(double addBal) {
        System.out.println("You added "+addBal+" dong.");
        this.balance += addBal;
        this.num++;
        System.out.println("Day "+this.num+": You got "+this.balance+" dong.");
    }
    public static void main(String[] args) {
        
    }
}