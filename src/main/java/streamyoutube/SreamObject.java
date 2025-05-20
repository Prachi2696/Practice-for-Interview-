package streamyoutube;

import java.util.Arrays;
import java.util.stream.Stream;

public class SreamObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Object> emptystream = Stream.empty();
		emptystream.forEach(e -> System.out.println(e));
		
		String[] names = {"prachi","amey","sagar","magan"};
		Stream<String> streamnames= Stream.of(names);
		streamnames.forEach(System.out::println);
		
		Stream<Object> streambuilder= Stream.builder().build();
		
		Stream<Object> arr=Arrays.stream(names);
		arr.forEach(System.out::print);
//		.strem()
	}

}
