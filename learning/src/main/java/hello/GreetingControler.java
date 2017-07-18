package hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingControler {
	private String template = "hello, %s";
	private AtomicLong counter = new AtomicLong();

	//@RequestMapping(value = "/greeting", name = "greting", method = RequestMethod.GET )
	@RequestMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

}
