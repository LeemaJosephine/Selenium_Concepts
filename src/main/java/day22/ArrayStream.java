package day22;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"Hi","Hello","World"};
		
		Stream<String> stream = Arrays.stream(arr);
		
		stream.forEach(str -> System.out.println(str));
	}

}
