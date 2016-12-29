package datepackege;

public class DateForm {
	private String year;
	private String mounth;
	private int countDay;
	
	public DateForm(String year, String mounth, int countDay){
		this.year = year;
		this.mounth = mounth;
		this.countDay = countDay;
	}
	
	public String getYear(){
		return this.year;
	}
	public String getMounth(){
		return this.mounth;
	}
	public int getCountDay(){
		return this.countDay;
	}	
}
