package ru.yandex.incoming34;

public class Working {
	final int SIZE = 4;
	String[][] array = new String[SIZE][SIZE];
	String[][] anotherArray = new String[2][2];

	public Working() {
		array[0][0] = "123456";
		array[0][1] = "36547";
		array[0][2] = "456981";
		array[0][3] = "Apple";

		array[1][0] = "123548";
		array[1][1] = "Orange1579";
		array[1][2] = "459871";
		array[1][3] = "4569871";

		array[2][0] = "175412";
		array[2][1] = "369854";
		array[2][2] = "7451258";
		array[2][3] = "54123987";

		array[3][0] = "12";
		array[3][1] = "000000";
		array[3][2] = "5664781";
		array[3][3] = "000574";
	}

	private void transform(String[][] strings) throws MyArraySizeException, MyArrayDataException {
		if ((strings[0].length != SIZE) || (strings.length != SIZE)) {
			throw new MyArraySizeException(strings);
		}
		int figure = 0;
		for (String[] oneString : strings) {
			for (String line : oneString)
				try {
					figure = figure + (int) Integer.parseInt(line);
				} catch (NumberFormatException nex) {
					throw new MyArrayDataException(line);

				}

		}

		System.out.println("Sum in array is " + figure);
	}

	public void procedure() {
		try {
			transform(array);
			transform(anotherArray);
		} catch (MyArraySizeException | MyArrayDataException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
