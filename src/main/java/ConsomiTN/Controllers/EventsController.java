package ConsomiTN.Controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ConsomiTN.Entities.Categorie;
import ConsomiTN.Entities.Events;
import ConsomiTN.Services.EventsService;
@CrossOrigin(origins="*")
@RestController

public class EventsController {
	@Autowired
	EventsService eventsService;
	@GetMapping("/Events")
	@ResponseBody
	public List<Events> getAllEvents(){
		List<Events> list = eventsService.getAllEvents();
		return list;
	}
	@PostMapping("/saveEvents")
	@ResponseBody
	public Events saveEvents(@RequestBody Events P)
	{
		return eventsService.saveEvents(P);
	}
@DeleteMapping("/deleteEvents/{id}")
@ResponseBody
public void deleteEvents(@PathVariable("id") Long idEvents){
	eventsService.deleteEventsById(idEvents);
}
@PutMapping("/updateEvents")
@ResponseBody
public Events updateEvents(@RequestBody Events events) {
    return eventsService.updateEvents(events);
}
}


