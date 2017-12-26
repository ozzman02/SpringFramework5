package guru.springframework.services;

//import org.springframework.context.annotation.Primary;
//import org.springframework.context.annotation.Profile;
//import org.springframework.stereotype.Service;

//@Service
//@Primary
//@Profile("es")
public class PrimarySpanishGreetingServiceImpl implements GreetingService {

	private GreetingRepository greetingRepository;
	
	public PrimarySpanishGreetingServiceImpl(GreetingRepository greetingRepository) {
		this.greetingRepository = greetingRepository;
	}
	
	@Override
	public String sayGreeting() {
		return greetingRepository.getSpanishGreeting();
	}

}
