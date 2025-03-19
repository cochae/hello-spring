package com.skuniv.Bookblog;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class NotionController {
    private final NotionRepository notionRepository;

    @GetMapping("/notion")
    public String notion(Model model) {
        List<Notion> notions = notionRepository.findAll();
        model.addAttribute("notions", notions);
        Notion notion = new Notion();
        System.out.println(notion);
        return "notion.html";
    }
}
