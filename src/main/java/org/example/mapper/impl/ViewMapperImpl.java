package org.example.mapper.impl;

import org.example.entity.View;
import org.example.mapper.ViewMapper;
import org.example.model.ViewedDto;
import org.springframework.stereotype.Component;

@Component
public class ViewMapperImpl implements ViewMapper {


    @Override
    public View map(ViewedDto viewedDto) {
        View view = new View();
        view.setContentGuid(viewedDto.getContentGuid());
        view.setUserGuid(viewedDto.getUserGuid());
        return view;
    }
}
