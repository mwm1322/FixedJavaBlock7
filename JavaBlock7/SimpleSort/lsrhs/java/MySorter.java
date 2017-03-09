package lsrhs.java;

// sorter that needs to be completed by YOU, trying to figure out how to sort an array 
public class MySorter extends SimpleSorterAbstract {
	public int[] a;
	public int[] sort(int[] a) {
		this.a = a;
		for (int i = 0; i < a.length; i++) {
			for (int j = a.length-1; j > i; j--) {
				if (a[j] < a[j-1]) {
					swap(j, j-1);
					//printArray(a);
				}
			}
		}

		return a;
	}

	void swap(int i, int j) {
		int keeper = a[i];
		a[i] = a[j];
		a[j] = keeper;
	}

	public static void printArray(int[] a) {
		for (int n : a) {
			System.out.print(n + " ");
		}
		System.out.println();
	}

}

