package com.sushmit.CreationalPatterns.BuilerPattern.GoodCode;

public class House {
	private String foundation;
	private String structure;
	private String roof;
	private boolean hasGarage;
	private boolean hasSwimmingPool;
	private boolean hasGarden;
	
	public House(HouseBuilder builder) {
		this.foundation = builder.foundation;
		this.structure = builder.structure;
		this.roof = builder.roof;
		this.hasGarage = builder.hasGarage;
		this.hasSwimmingPool = builder.hasSwimmingPool;
		this.hasGarden = builder.hasGarden;
	}

	@Override
	public String toString() {
		return "House [foundation=" + foundation + ", structure=" + structure + ", roof=" + roof + ", hasGarage="
				+ hasGarage + ", hasSwimmingPool=" + hasSwimmingPool + ", hasGarden=" + hasGarden + "]";
	}
	
	public static class HouseBuilder{
		private String foundation;
		private String structure;
		private String roof;
		private boolean hasGarage;
		private boolean hasSwimmingPool;
		private boolean hasGarden;
		
		// Mandatory Fields constructor
		public HouseBuilder(String foundation, String structure, String roof) {
			this.foundation = foundation;
			this.structure = structure;
			this.roof = roof;
		}
		
		// Optional Parameters
		public HouseBuilder setGarden(boolean hasGarden) {
			this.hasGarden = hasGarden;
			return this;
		}
		
		public HouseBuilder setGarage(boolean hasGarage) {
			this.hasGarage = hasGarage;
			return this;
		}
		
		public HouseBuilder setSwimmingPool(boolean hasSwimmingPool) {
			this.hasSwimmingPool = hasSwimmingPool;
			return this;
		}
		
		public House build() {
			return new House(this);
		}
	}
}
