abstract class Calculator {
    private Calculator next;

    public  Calculator(Calculator next){
        this.next = next;
    }

    public void Calculate(String calculation){
        if(next != null)
            next.Calculate(calculation);
    };
}

