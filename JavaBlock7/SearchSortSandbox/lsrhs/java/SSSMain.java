package lsrhs.java;

public class SSSMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			SSSData d1 = new SSSData(1000);
			//SSSData d2 = new SSSData(1000);


			for (int i = 0; i < 5; i++) {
				d1.sort();
				System.out.println(i+1 + ". Binary Sorted: " + lookupBinary(d1, 56));
				d1.printHits();
				d1.randomize();
				d1.resetHitCount();
			}

			for (int i = 0; i < 5; i++) {
				d1.sort();
				System.out.println(i+1 + ". Linear Sorted: " + lookupLinear(d1, 56));
				d1.printHits();
				d1.randomize();
				d1.resetHitCount();
			}

			for (int i = 0; i < 5; i++) {
				System.out.println(i+1 + ". Binary Not Sorted: " + lookupBinary(d1, 56));
				d1.printHits();
				d1.randomize();
				d1.resetHitCount();
			}

			for (int i = 0; i < 5; i++) {
				System.out.println(i+1 + ". Linear Not Sorted: " + lookupLinear(d1, 56));
				d1.printHits();
				d1.randomize();
				d1.resetHitCount();
			}
	}

	static int lookupLinear(SSSData data, int value){
		for (int i = 0; i < data.getLength(); i++) {
			if (data.get(i) == value) {
				return i;
			}
		}
		return -1;
	}

	static int lookupBinary(SSSData data, int value) {
		int max = data.getLength();
		int min = 0;
		while (max >= min) {
			int pivot = (min + max) / 2;
			int number = data.get(pivot);
			if (number == value) {
				return pivot;
			}
			if (number < value) {
				min = pivot + 1;
			}
			if (number > value) {
				max = pivot - 1;
			}
		}
		return -1;
	}
}
