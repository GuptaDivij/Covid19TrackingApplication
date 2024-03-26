package models;

public class LocationStats {
	
	private String state;
	private String country;
	private int latestCases;
	private int diffFromPrevDay;
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getLatestCases() {
		return latestCases;
	}
	public void setLatestCases(int cases) {
		this.latestCases = cases;
	}
	
	@Override
	public String toString() {
		return "LocationStats{" + "state='" + state +  '\'' + ", latestCases=" + latestCases + '}';
	}
	public void setDiffFromPrevDay(int diffFromPrevDay) {
        this.diffFromPrevDay = diffFromPrevDay;
    }
	public int getDiffFromPrevDay() {    
		return diffFromPrevDay;
	}
}
