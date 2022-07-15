package org.example.controller;

import org.example.model.ViewedDto;
import org.example.services.ViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ViewController {

    @Autowired
    private ViewService viewService;

    /**
     * Фиксация просмотра таргетированного предложения
     * @param viewedDto
     */
    @PostMapping(path = "/viewed/save")
    public void saveView(@RequestBody ViewedDto viewedDto){
        viewService.saveView(viewedDto);
    }


}
