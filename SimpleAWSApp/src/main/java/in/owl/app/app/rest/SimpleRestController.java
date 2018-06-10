package in.owl.app.app.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SimpleRestController {

	@RequestMapping("/echo")
	public String echo() {
		return "owlawsapp is up and running......";
	}
}
