public class Matter {
	
	String myName;
	boolean imFine = true;
	double myPosition=0;
	double myVelocity=0;
	double myAcceleration=1;
	double force=1;
	double myMass = 2;
	
	public Matter() {}
	public Matter(String name){
		myName = name;
	}
	
	public void updatePosition(){
		myPosition += myVelocity;
	}
	public void updateVelocity(){
		myVelocity += myAcceleration;
	}
	public void updateAcceleration(){
		myAcceleration = force/myMass;
	}
	public void updateEmotionalStatus(){
		if(myPosition>10) imFine = false;
	}
	
	public String toString(){
		if(myName != null) {
			if (imFine) return String.format("I (%s) am fine, my position: %s", myName, myPosition);
			return String.format("I (%s) am not fine", myName);
		} else {
			if (imFine) return String.format("I'm fine, my position: %s", myPosition);
			return "I am not fine";
		}
	}
	
}
