package LearnSingleTon;

public class Person {

	public void drinkWater( int litres) {
		WaterTanker w = WaterTanker.getTanker();
		w.getWater(litres);
	}
}
