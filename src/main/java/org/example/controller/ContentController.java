package org.example.controller;

import org.example.entity.Content;
import org.example.entity.ContentData;
import org.example.services.impl.ContentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.UUID;

@RestController
@RequestMapping("cds")
public class ContentController {
    @Autowired
    private ContentServiceImpl contentService;

    /**
     * Хранение информации о содержимом контента
     *
     * @param contentData контент
     */
    @PostMapping(path = "/content/save")
    public ModelAndView saveContent(@ModelAttribute("contentData") ContentData contentData, ModelAndView modelAndView) {
        Content content = new Content();
        content.setData(contentData);
        contentService.saveContent(content);
        return modelAndView;
    }

    /**
     * Получение информации о содержимом контента
     *
     * @param modelAndView
     * @return
     */
    @GetMapping(path = "/content/get")
    public ModelAndView getContent(ModelAndView modelAndView) {
        Content content = contentService.getContentById(UUID.randomUUID());
        modelAndView.addObject("content", content);
        return modelAndView;
    }

    /**
     * Проверка сохранения информации о пользователе
     * @param contentData
     * @param modelAndView
     * @return
     */
    @GetMapping(path = "/content/save")
    public ModelAndView saveContentExample(@ModelAttribute("contentData") ContentData contentData, ModelAndView modelAndView) {
        modelAndView.setViewName("contentPage");
        return modelAndView;
    }

}
