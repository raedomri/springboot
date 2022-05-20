package ConsomiTN.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ConsomiTN.Entities.Categorie;
import ConsomiTN.Entities.Events;
import ConsomiTN.Repositories.EventsRepository;
@Service

public class EventsServiceImplimentation implements EventsService{
	 @Autowired
	  
	 EventsRepository eventsRepository;

	
	
	@Override
	public Events saveEvents(Events E) {
		
		return eventsRepository .save(E);
	}

	@Override
	public Events updateEvents(Events E) {
		
		return eventsRepository.save(E);
	}

	@Override
	public void deleteEvents(Events E) {
		eventsRepository.delete(E);
		
	}

	@Override
	public void deleteEventsById(Long id) {
		
		eventsRepository.deleteById(id);
	}

	@Override
	public Events getEvents(Long id) {
		
		return eventsRepository.findById(id).get();
	}
	

	@Override
	public List<Events> getAllEvents() {
		
		return (List<Events>)eventsRepository.findAll();
	}
	@Override
	public void addParticipate(Long id) {
		//Events e = eventsRepository.findById(id).orElse(null);
		//e.incrimentParticipate();
		//long ide = eventsRepository.save(e).getIdEvents(ide));
	 return ;
	}
}
