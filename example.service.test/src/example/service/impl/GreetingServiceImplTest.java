package example.service.impl;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringStartsWith.startsWith;

import org.junit.jupiter.api.Test;

class GreetingServiceImplTest {
	
	GreetingServiceImpl sut = new GreetingServiceImpl();

	@Test
	void testGreetingMessage() {
		assertThat(sut.greetingMessage(), startsWith("Greetings from Service") );
	}

}
