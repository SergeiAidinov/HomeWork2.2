package ru.yandex.incoming34;

public class MyArrayDataException extends Exception {
	
	MyArrayDataException(String line){
		System.out.println(line + " is not a number!");
		
	}

}
