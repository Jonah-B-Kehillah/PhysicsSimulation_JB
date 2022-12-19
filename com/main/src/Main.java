public class Main {
	public static void main(String[] args){
		
		Matter me = new Matter();
		Matter you = new Matter("you");
		you.force=-me.force;
		
		while(me.imFine) {
			me.updateAcceleration();
			me.updateVelocity();
			me.updatePosition();
			System.out.println(me);
			me.updateEmotionalStatus();

			you.updateAcceleration();
			you.updateVelocity();
			you.updatePosition();
			System.out.println(you);
			you.updateEmotionalStatus();
		}
	
	}
}
