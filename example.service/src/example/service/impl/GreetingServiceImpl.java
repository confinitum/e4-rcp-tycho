package example.service.impl;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import org.osgi.service.component.annotations.Component;

import example.service.GreetingService;

@Component
public class GreetingServiceImpl implements GreetingService {

	@Override
	public String greetingMessage() {
		return "Greetings from Service at "+ 
				LocalDateTime.now().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
	}

}
