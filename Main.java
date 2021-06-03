public class Main {

	public static void main(String[] args) {
		System.out.println("Instantiate objects here!");

			MelonType musk = new MelonType(
		"musk",
		"Muskmelon",
		1998,
		"green",
		true,
		true
	);

	MelonType casaba = new MelonType(
		"cas",
		"Casaba",
		2003,
		"orange",
		true,
		false
	);

	MelonType crenshaw = new MelonType(
		"cren",
		"Crenshaw",
		1996,
		"green",
		true,
		false
	);

	MelonType yellowWatermelon = new MelonType(
		"yw",
		"Yellow Watermelon",
		2013,
		"yellow",
		true,
		false
	);

	MelonType[] melonTypes = {musk, casaba, crenshaw, yellowWatermelon};
	
	// System.out.println(Arrays.toString(melonTypes));
	
	}
}
