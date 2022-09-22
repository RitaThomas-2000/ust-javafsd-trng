package Optional;

import java.util.Optional;

public class OptionalClassExample3 {
	public static void main(String[] args) {
		Optional<String> emptyOption=Optional.empty();
		Optional<String> strOption=Optional.of("one");
		System.out.println(emptyOption.orElseGet(()->"optional null orElseGet"));
		System.out.println(strOption.orElseGet(()->"optional value orElseget"));
	}
}
