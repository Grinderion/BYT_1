public abstract class Template {

    public abstract void createName(Character character);
    public abstract void setStats(Character character);


    final void characterGeneration(Character character){
        createName(character);
        setStats(character);
        System.out.println("Name: " + character.name);
        System.out.println(character.main_stat_name + ": " + character.main_stat);
        System.out.println(character.secondary_stat_name + ": " + character.secondary_stat);
        System.out.println("Stamina: " + character.stamina);
    };

}
