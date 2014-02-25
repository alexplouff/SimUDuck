package version5;

public class MiniDuckSimulator {

	public static void main(String[] args) {
            
                FlyStrategy fs = null;
                QuackStrategy qs;
                SwimStrategy ss;
            
//                FlyQuackAndSwim mallard = new MallardDuck( new FlyWithWings() , new Quack(), new Swim() );
//                mallard.display();
//                mallard.swim();
//            
//		mallard.performQuack();
//		mallard.performFly();
//                mallard.setFlyStrategy(new FlyRocketPowered());
//                mallard.setQuackStrategy(new Squeak());
//                mallard.performQuack();
//		mallard.performFly();

                QuackGroup [] ducks = {
                    
                    new MallardDuck(new FlyWithWings(), new Quack(), new Swim()),
                    new RubberDuck(new Squeak(), new Swim())
                    
                };
                
                for (QuackGroup duck : ducks){
                    duck.display();
                    duck.performQuack();
                    duck.swim();
                    
                }
//		 Duck model = new ModelDuck();
//		model.display();
//                model.swim();
//		model.performFly();
//		model.setFlyStrategy( new FlyRocketPowered() );
//		model.performFly();
	}

}
