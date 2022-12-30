public class Main {
	
	public static double computeForce(Matter m1, Matter m2){
		return m1.position - m2.position;
	}
	
	public static void main(String[] args){
		
		Matter me = new Matter(10);
		Matter you = new Matter("you");
		
		while(me.isFine) {
			me.force  = computeForce(me, you);
			you.force = computeForce(you, me);
			
			me.updateAcceleration();
			me.updatePosition();
			me.updateVelocity();
			System.out.println(me);
			me.updateEmotionalStatus();

			you.updateAcceleration();
			you.updatePosition();
			you.updateVelocity();
			System.out.println(you);
			you.updateEmotionalStatus();
		}
	
	}
}
