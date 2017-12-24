package guru.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingRepositoryImpl implements GreetingRepository {

	@Override
	public String getEnglishGreeting() {
		return "Hello - Primary Greeting Service";
	}

	@Override
	public String getSpanishGreeting() {
		return "Servicio de saludo primario";
	}

	@Override
	public String getGermanGreeting() {
		return "Primärer Begrüßungsdienst";
	}

}
