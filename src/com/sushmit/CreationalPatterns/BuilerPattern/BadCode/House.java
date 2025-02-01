package com.sushmit.CreationalPatterns.BuilerPattern.BadCode;

public class House {
	private String foundation;
	private String structure;
	private String roof;
	private boolean hasgarage;
	private boolean hasSwimmingPool;
	private boolean hasGarden;
	
	public House(String foundation, String structure, String roof, boolean hasgarage, boolean hasSwimmingPool,
			boolean hasGarden) {
		super();
		this.foundation = foundation;
		this.structure = structure;
		this.roof = roof;
		this.hasgarage = hasgarage;
		this.hasSwimmingPool = false;
		this.hasGarden = hasGarden;
	}

	@Override
	public String toString() {
		return "House [foundation=" + foundation + ", structure=" + structure + ", roof=" + roof + ", hasgarage="
				+ hasgarage + ", hasSwimmingPool=" + hasSwimmingPool + ", hasGarden=" + hasGarden + "]";
	}
}
