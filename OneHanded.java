public class OneHanded implements State {

    public void doAction(Spec spec) {
        System.out.println("Player deals: " + spec.getStrength() * multiplier + " damage");
        spec.setState(this);
    }

    public String toString(){
        return "One Handed";
    }
}
