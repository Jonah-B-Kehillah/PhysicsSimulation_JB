public class Matter {
	
	String name;
	boolean isFine = true;
	double position =0;
	double velocity =0;
	double acceleration =1;
	double force=1;
	double mass = 2;
	
	public Matter() {}
	public Matter(double position){
		this.position = position;
	}
	public Matter(String name){
		this.name = name;
	}
	public Matter(String name, double position) {
		this.name = name;
		this.position = position;
	}
	
	public void updatePosition(){
		position += velocity;
	}
	public void updateVelocity(){
		velocity += acceleration;
	}
	public void updateAcceleration(){
		acceleration = force/ mass;
	}
	public void updateEmotionalStatus(){
		if(position >10) isFine = false;
	}
	
	public String toString(){
		if(name != null) {
			if (isFine) return String.format("I (%s) am fine, my position: %s", name, position);
			return String.format("I (%s) am not fine", name);
		} else {
			if (isFine) return String.format("I'm fine, my position: %s", position);
			return "I am not fine";
		}
	}
	
}
