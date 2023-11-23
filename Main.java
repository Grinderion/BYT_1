public class Main {



    public static void main(String[] args) {

        //Calculator - chain of responsibility design pattern
        String calc1 = "237+7*4";
        String calc2 = "23*7-104";
        String calc3 = "222+7-104";
        Calculator calculator = new Priority_One(new Priority_Two(null));
        calculator.Calculate(calc1);
        calculator.Calculate(calc2);
        calculator.Calculate(calc3);

        //State Design Pattern
        Spec spec1 = new Spec();
        spec1.setStrength(10);

        OneHanded oneHanded = new OneHanded();
        oneHanded.doAction(spec1);

        System.out.println(spec1.getState().toString());

        TwoHanded twoHanded = new TwoHanded();
        twoHanded.doAction(spec1);

        //Templete method pattern
        
        Mage mageGenerator = new Mage();
        Warrior warriorGenerator = new Warrior();
        System.out.println(spec1.getState().toString());
        Character mage1 = new Character();
        Character warrior1 = new Character();
        Character warrior2 = new Character();
        mageGenerator.characterGeneration(mage1);
        warriorGenerator.characterGeneration(warrior1);
        warriorGenerator.characterGeneration(warrior2);


    }
}
