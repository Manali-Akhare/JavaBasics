class Array {
	public static void main(String args[]) {

		int a[][] = { { 1, 3, 4 }, { 3, 4, 5 }, { 2, 1, 2 } };
		int b[][] = { { 1, 3, 4 }, { 3, 4, 5 }, { 3, 4, 2 } };
		int c[][] = new int[3][3];
		System.out.println("Addition is");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = a[i][j] + b[i][j];

				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}

	}
}
