public class TwoHanded implements State {

    int multiplier = 2;

    public void doAction(Spec spec) {
        System.out.println("Player deals: " + spec.getStrength() * multiplier + " damage");
        spec.setState(this);
    }

    public String toString(){
        return "Two Handed";
    }
}