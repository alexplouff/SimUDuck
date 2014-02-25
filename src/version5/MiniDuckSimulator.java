package version5;

public class MiniDuckSimulator {

	public static void main(String[] args) {
            
                FlyStrategy fbs;
                QuackStrategy qbs;
            
                Duck mallard = new MallardDuck( new FlyWithWings() , new Quack() );
                mallard.display();
                mallard.swim();
            
		mallard.performQuack();
		mallard.performFly();
                mallard.setFlyBehavior(new FlyRocketPowered());
                mallard.setQuackBehavior(new Squeak());

//		Duck model = new ModelDuck();
//		model.display();
//		model.performFly();
//		model.setFlyBehavior( new FlyRocketPowered() );
//		model.performFly();
	}

}
