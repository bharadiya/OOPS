package LearnSingleTon;

public class test {
	public static void main(String[] args) {
		WaterTanker p = WaterTanker.getTanker();
		Person abhi = new Person();
		Person shashank = new Person();

		p.fillWater(10);
		abhi.drinkWater(1);
		shashank.drinkWater(1);
		p.fillWater(10);
		abhi.drinkWater(1);
		shashank.drinkWater(1);
		System.out.println(p.getWaterLevel());
	}
}
