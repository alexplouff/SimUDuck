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

    private FlyStrategy fs;
    private QuackStrategy qs;

    public MallardDuck(FlyStrategy fs, QuackStrategy qs) {
        this.fs = fs;
        this.qs = qs;
    }

    public void setQuack(QuackStrategy qs) {
        this.qs = qs;
    }
    
    public void setFlyStrategy(FlyStrategy fs) {
        this.fs = fs;
    }

    public void performQuack() {
        qs.quack();
    }

    public void performFly() {
        fs.fly();
    }

    public FlyStrategy getFs() {
        return fs;
    }

    @Override
    public void display() {
        System.out.println("I'm a Mallard Duck");
    }

}

//swim