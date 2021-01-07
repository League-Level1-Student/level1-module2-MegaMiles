package _05_minion;

public class MINION {
	
	private String name;
	private int eyes; 
	private String color; 
	private String master;
	
	public MINION(String string, int i, String string2, String string3) {
		this.name = string;
		this.eyes = i;
		this.color = string2;
		this.master = string3;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public int getEyes() {
		// TODO Auto-generated method stub
		return eyes;
	}

	public String getColor() {
		// TODO Auto-generated method stub
		return color;
	}

	public void setMaster(String newmaster) {
		// TODO Auto-generated method stub
		 this.master = newmaster;
	}

	public String getMaster() {
		// TODO Auto-generated method stub
		return master;
	}

}

