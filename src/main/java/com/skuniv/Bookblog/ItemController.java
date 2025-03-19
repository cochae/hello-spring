package com.skuniv.Bookblog;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class ItemController {
    private final ItemRepository itemRepository;

    @GetMapping("/list")
    String list(Model model) {
        List<Item> result = itemRepository.findAll();
        model.addAttribute("items", result);
        return "list.html";
    }
    @GetMapping("/write")
    String write(Model model) {
        return "write.html";
    }
    @PostMapping("/add")
     String addPost(@ModelAttribute Item item){
       itemRepository.save(item);
        return "redirect:/list";
    }
    @GetMapping("/detail/{id}")
    String detail(@PathVariable Integer id, Model model){
        Optional<Item> result = itemRepository.findById(id);
        if(result.isPresent()){
        System.out.println(result.get());
        model.addAttribute("data", result.get());
        return "detail.html";
        }
        else{
            return "redirect:/list";
        }

    }
}