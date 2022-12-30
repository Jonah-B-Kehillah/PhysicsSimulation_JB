public class Main {
	public static void main(String[] args){
		
		Matter me = new Matter();
		Matter you = new Matter("you");
		
		me.myPosition = 10;
		
		while(me.imFine) {
			me.force = me.myPosition - you.myPosition;
			you.force=-me.force;
			
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
