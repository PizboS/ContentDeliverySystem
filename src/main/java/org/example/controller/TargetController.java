package org.example.controller;

import org.example.entity.ContentData;
import org.example.entity.Target;
import org.example.model.TargetDto;
import org.example.model.TargetRequestDto;
import org.example.services.impl.TargetServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.UUID;

@RequestMapping("cds")
@RestController
public class TargetController {

    @Autowired
    private TargetServiceImpl targetService;

    /**
     * Сохранение информации о таргете
     *
     * @param target реклама
     */
    @PostMapping(path = "/target/save")
    public String saveTarget(@ModelAttribute("target") TargetDto target) {
        targetService.saveTarget(target);
        return "redirect:/cds/target/save";
    }

    /**
     * Получение информации о таргете
     *
     * @param modelAndView
     * @return
     */
    @PostMapping(path = "/target/get")
    public ModelAndView getTarget(@RequestBody TargetRequestDto requestDto, ModelAndView modelAndView) {
        List<Target> targetList = targetService.getTargetsByUserAndPage(requestDto);
        modelAndView.addObject("targetList", targetList);
        return modelAndView;
    }

    /**
     * Проверка сохранение информации о таргете
     * @param target
     * @param modelAndView
     * @return
     */
    @GetMapping(path = "/target/save")
    public ModelAndView saveTargetExample(@ModelAttribute("target") TargetDto target, ModelAndView modelAndView) {
        modelAndView.setViewName("targetPage");
        return modelAndView;
    }


}
