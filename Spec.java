public class Spec {
    private State state;
    private  int strength;

    public Spec(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }

    public void setStrength(int strength){
        this.strength = strength;
    }

    public  int getStrength(){
        return strength;
    }
}