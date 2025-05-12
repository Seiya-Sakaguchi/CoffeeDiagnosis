package model;

public class CoffeeProfile {
	private String name;
	private String origin;
	private String elevation;
	private String process;
	private String varieties;
	private String flavor_notes;
	
	
	public CoffeeProfile() {}
	
	public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getOrigin() { return origin; }
    public void setOrigin(String origin) { this.origin = origin; }

    public String getElevation() { return elevation; }
    public void setElevation(String elevation) { this.elevation = elevation; }

    public String getProcess() { return process; }
    public void setProcess(String process) { this.process = process; }

    public String getVarieties() { return varieties; }
    public void setVarieties(String varieties) { this.varieties = varieties; }

    public String getFlavor_notes() { return flavor_notes; }
    public void setFlavor_notes(String flavor_notes) { this.flavor_notes = flavor_notes; }
}
