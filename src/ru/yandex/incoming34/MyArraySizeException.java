package ru.yandex.incoming34;

public class MyArraySizeException extends Exception {

	public MyArraySizeException(String[][] array2) {
		System.out.println("Array " + array2.getClass().getSimpleName() + " has invalid size.");
	}

}
