package version5;

public class ModelDuck implements Duck {

    
        
        public ModelDuck(){
            
        }
        
        @Override
	public void swim(){
            System.out.println("Floating.....");
        }
	
        @Override
	public void display() {
		System.out.println("I'm a model duck");
	}
}
