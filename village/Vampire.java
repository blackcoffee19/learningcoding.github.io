class Vampire extends Villager {
    private String aname; 
    Vampire(String name){
        super("vampie");
        this.aname = name;
    }
    @Override
    public void greeting(){
        System.out.println("My name is "+this.aname+" Do you want to visit my castle?");
        super.act = "kill you";
        System.out.println("It "+super.act);
    }
}