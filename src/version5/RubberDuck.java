package version5;

public class RubberDuck implements Duck {

    QuackBehaviorStrategy qbs;

    public RubberDuck(QuackBehaviorStrategy qbs) {
        this.qbs = qbs;

    }

    public void setQuack(QuackBehaviorStrategy qbs) {
        setQuack(qbs);
    }

    public void performQuack() {
        qbs.quack();
    }

    public QuackBehaviorStrategy getQbs() {
        return qbs;
    }

    public void setQbs(QuackBehaviorStrategy qbs) {
        this.qbs = qbs;
    }

    @Override
    public void swim() {
        System.out.println("Floating.....");
    }

    @Override
    public void display() {
        System.out.println("I'm a Rubber Duck");
    }

}
