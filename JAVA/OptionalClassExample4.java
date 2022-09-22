package Optional;
import java.util.Optional;

public class OptionalClassExample4 {
	public static void main(String[] args) {
		Optional<String> strOptional=Optional.of("ONETWOTHERE");
		Optional<String> srOptional1=strOptional.map(String::toLowerCase);
		srOptional1.ifPresent(System.out::println);
		
		
		
	}
}
