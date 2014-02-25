package version5;

public class RubberDuck implements QuackGroup {

    QuackStrategy qs;
    SwimStrategy ss;

    public RubberDuck(QuackStrategy qs, SwimStrategy ss){
        this.qs = qs;
        this.ss = ss;
    }

    @Override
    public void setQuackStrategy(QuackStrategy qs){
        this.qs = qs;
    }

    @Override
    public void performQuack() {
        qs.quack();
    }

    public void swim() {
        System.out.println("Floating.....");
    }

    @Override
    public void display() {
        System.out.println("I'm a Rubber Duck");
    }

}
