package com.it355.draganmitic.controller;

import com.it355.draganmitic.model.HotelRoom;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
@RequestMapping("/hotel")
public class HotelController {
    
    @Autowired
    private MessageSource messageSource;
    
    @RequestMapping(value = "/room", method = RequestMethod.GET)
    public ModelAndView room() {
        return new ModelAndView("hotel-room", "command", new HotelRoom());
    }
    
    @RequestMapping(value = "/room/add", method = RequestMethod.POST)
    public String roomAdd(@ModelAttribute HotelRoom room, ModelMap model) {
        model.addAttribute("beds", room.getBeds());
        model.addAttribute("space", room.getSpace());
        model.addAttribute("bathroom", room.getBathroom());
        model.addAttribute("tv", room.getTv());
        model.addAttribute("airConditioning", room.getAirConditioning());
        model.addAttribute("pricePerDay", room.getPricePerDay());
        
        return "hotel-room-view";
    }
    
}
