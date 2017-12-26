package guru.springframework.services;

public class GreetingServiceFactory {
	
	private GreetingRepository greetingRepository;

	public GreetingServiceFactory(GreetingRepository greetingRepository) {
		this.greetingRepository = greetingRepository;
	}
	
	public GreetingService createGreetingService(String lang) {
		switch (lang) {
			case "en":
				return new PrimaryGreetingServiceImpl(greetingRepository);
			case "de":
				return new PrimaryGermanGreetingServiceImpl(greetingRepository);
			case "es":
				return new PrimarySpanishGreetingServiceImpl(greetingRepository);
			default:
				return new PrimaryGreetingServiceImpl(greetingRepository);
		}
	}
	

}
