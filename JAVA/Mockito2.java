import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class Mockito2 {

	@Test
	void test() {
		//fail("Not yet implemented");
		List<String> lst=new ArrayList<>();
		List<String> s=spy(lst);
		when(s.size()).thenReturn(5);
		assertEquals(5, s.size());
		
		s.add("Lekshmi");
		s.add("jayanth");
		assertEquals("Lekshmi", s.get(0));
	}

}
