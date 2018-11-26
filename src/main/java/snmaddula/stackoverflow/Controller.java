package snmaddula.stackoverflow;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hsm")
public class Controller {

	@Value("${hsm.ip}")
	private String ip;

	@Value("${hsm.port}")
	private String port;

	@Value("${hsm.name}")
	private String name;

	@Value("${hsm.timeout}")
	private String timeout;

	@Value("${hsm.provider}")
	private String provider;

	@GetMapping("/check")
	public String checkValues() {
		return new StringBuilder()
				.append("ip=" + ip)
				.append("\nport=" + port)
				.append("\nname=" + name)
				.append("\ntimeout=" + timeout)
				.append("\nprovider=" + provider)
				.toString();
	}
}
