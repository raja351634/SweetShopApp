package com.magizhi.sweetshop.controller;

import com.magizhi.sweetshop.model.Item;
import com.magizhi.sweetshop.service.Catalog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

   @Autowired
   private Catalog catalog;

    @GetMapping("/listItems")
    public String displayItems(Model model){
        List<Item> items = catalog.getItemList();
        model.addAttribute("items",items);
        return "home";
    }
}
