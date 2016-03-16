package DataClasses;

import org.junit.Test;

public class ImmutableDataClassTest {

	ImmutableDataClass immutable = new ImmutableDataClass(1, "my_name");

	@Test
	public void when_tryingToFindSetter_then_notFound() {
		/* wont compile: */
//		immutable.setId
	}

}
