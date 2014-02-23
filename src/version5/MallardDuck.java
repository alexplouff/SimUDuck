package version5;

/*
 * Wait a second, didn't we say we should NOT program
 * to an implementation? But what are we doing in that
 * constructor? We're making a new instance of a concrete
 * Quack implementation class!
 * 
 * Good catch! That's exactly what we're doing ... for now!
 * Later, we'll have more design patterns that can help fix
 * this problem.
 * 
 * Still, notice that while we are setting the behaviors
 * to concrete classes, we could easily change that at runtime.
 * So we still have lots of flexibility here, but we're doing a
 * poor job of initializing the instance variables in a flexible
 * way. But think about it, since the quackBehavior instance
 * variable is an interface type, we could, through the magic
 * of polymorphism, dynamically asign a different QuackBehavior
 * implementation at runtime. We'll see this later.
 */
public class MallardDuck implements Duck {

    private FlyBehaviorStrategy fbs;
    private QuackBehaviorStrategy qbs;

    public MallardDuck(FlyBehaviorStrategy fbs, QuackBehaviorStrategy qbs) {

        this.fbs = fbs;
        this.qbs = qbs;
    }

    public void setQuack(QuackBehaviorStrategy qbs) {
        setQuack(qbs);
    }

    public void performQuack() {
        qbs.quack();
    }

    public void performFly() {
        fbs.fly();
    }

    public FlyBehaviorStrategy getFbs() {
        return fbs;
    }

    public void setFbs(FlyBehaviorStrategy fbs) {
        this.fbs = fbs;
    }

    public QuackBehaviorStrategy getQbs() {
        return qbs;
    }

    public void setQbs(QuackBehaviorStrategy qbs) {
        this.qbs = qbs;
    }

    @Override
    public void swim() {
        System.out.println("Swimming");
    }

    @Override
    public void display() {
        System.out.println("I'm a Mallard Duck");
    }

}
