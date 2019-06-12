package LearnSingleTon;

public class WaterTanker {
	int consume;

	static WaterTanker obj = new WaterTanker();

	private WaterTanker() {

	}

	public static WaterTanker getTanker() {
		return obj;
	}

	public int getWaterLevel() {
		return consume;

	}

	public int getWater(int litres) {
		// TODO Auto-generated method stub
		consume -= litres;
		return consume;
	}

	public int fillWater(int litres) {
		// TODO Auto-generated method stub
		consume += litres;
		return consume;
	}
}
