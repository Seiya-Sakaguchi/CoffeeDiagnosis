package model;

public class CoffeeProfile {
	private String name;
	private String region;
	private String altitude;
	private String process;
	private String variety;
	private String description;
	
	
	public CoffeeProfile() {}
	
	public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getRegion() { return region; }
    public void setRegion(String region) { this.region = region; }

    public String getAltitude() { return altitude; }
    public void setAltitude(String altitude) { this.altitude = altitude; }

    public String getProcess() { return process; }
    public void setProcess(String process) { this.process = process; }

    public String getVariety() { return variety; }
    public void setVariety(String variety) { this.variety = variety; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}
