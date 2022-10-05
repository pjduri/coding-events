package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {

    private static List<String> eventsList = new ArrayList<>();
    private static HashMap<String, String> events = new HashMap<>();

    @GetMapping
    public String displayEventsList(Model model) {
        events.put("Code with Rocko", "Modern Coding with a Kangaroo.");
        events.put("MenteaShip", "Fun event for newbie coders.");
        events.put("Code N Coffee", "Coding with caffeine.");

        model.addAttribute("title", "All Events");
        model.addAttribute("events", events);
        return "events/index";
    }

    // lives at /events/create
    @GetMapping("create")
    public String renderCreateEventForm() {
        return "events/create";
    }

    // lives at /events/create
    @PostMapping("create")
    public String createEvent(@RequestParam String eventName) {
        eventsList.add(eventName);
        return "redirect:";
    }

}
