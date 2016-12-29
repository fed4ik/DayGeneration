package modelstation;

public class StationForm {
		private String location;
		private String locationNumber;
		private int power;
		private int powerLost;
		
		public StationForm() {
		}
			
		
		public StationForm(String location, int power, int powerLost){
			this.location = location;
			this.power = power;
			this.powerLost = powerLost;
		}
		
		public String getLocation(){
			return this.location;
		}
		public String getLocationNumber(){
			return this.locationNumber;
		}
		
		public int getPowerLost(){
			return this.power;
		}
		public int getPower(){
			return this.powerLost;
		}
}
