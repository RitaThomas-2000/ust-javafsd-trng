package Optional;

import java.util.Optional;

public class OptionalClassExample2 {
	public static void main(String[] args) {
		Optional<String> str=Optional.of("one");
		System.out.println(str.orElse("defaultvalue"));
		Optional<String> str1=Optional.empty();
		System.out.println(str1.orElse("defaultvalue"));
	}
}
