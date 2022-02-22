public class Villager {
    protected String type;
    String name;
    int num = 0;
    String act;
    public Villager(String type) {
        this.type = type;
        this.name = "Noob";
        this.num++;
    }
    private void cou(){
        System.out.println("We have "+this.num+" "+this.type+"s in my village");
    }
    public void greeting(){
        System.out.println("Hello, Welcome to my vilager");
        this.act = "walk away";
        System.out.println("It "+this.act);
    }
    public static void main(String[] args) {
        Villager vill1 = new Villager("Villager");
        vill1.cou();
        vill1.greeting();
        Vampire vam1 = new Vampire("Vim");
        vam1.greeting();

        System.out.println("------------------");
        Villager vill2, vam2, vam3;
        vill2 = new Villager("farmer");
        vam2 = new Vampire("Lyli");
        vam3 = new Vampire("Layla");
        Villager[] allVillager = {vill1, vill2, vam1, vam2, vam3};
        for (Villager vi : allVillager) {
            vi.greeting();
            vi.cou();
        }

    }
}