public class BalanceAccount{
    int balance;
    int added;
    int subed;
    String day;
    int countingDay = 0;
    public BalanceAccount(String newDay, int currentBalance){
        balance = currentBalance;
        day = newDay;
        countingDay++;
    }
    public void myBalance(){
        System.out.println("Day "+ countingDay+": "+ "Today is "+day+", you have "+balance+"k.");
    }
    public void addCash(int addMoney){
        System.out.println("+ " +addMoney+"k");
        balance += addMoney;
        added = addMoney;
    }
    public void subtracMoney(String item, int subMoney){
        System.out.println("- " +subMoney+"k, you bought "+item);
        balance -=  subMoney;
        subed = subMoney;
    }
    public int usingMoney(){
        int useInWeek = added - subed;
        return useInWeek;
    }
    public String toString(){
        return "You have "+ balance+"k at Day "+countingDay;

    }
    public static void main(String[] args){
        BalanceAccount myCash = new BalanceAccount("Monday", 100);
        myCash.myBalance();
        myCash.addCash(21);
        myCash.subtracMoney("yagout", 23);
        System.out.println("Accouting... " + myCash.usingMoney());
        System.out.println(myCash);
    }
}