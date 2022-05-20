package ConsomiTN.Services;

import java.util.List;

import ConsomiTN.Entities.Events;

public interface EventsService {
	Events saveEvents(Events E);
	Events updateEvents(Events E);
	void deleteEvents (Events E);
	void deleteEventsById (Long id);
	Events getEvents(Long id);
	List<Events> getAllEvents();
	public void addParticipate(Long id);
}
