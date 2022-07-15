package org.example.mapper.impl;

import org.example.entity.Target;
import org.example.mapper.TargetMapper;
import org.example.model.TargetDto;
import org.example.services.ContentService;
import org.example.services.UserService;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class TargetMapperImpl implements TargetMapper {
    @Autowired
    private ContentService contentService;
    @Autowired
    private UserService userService;

    @Override
    public Target map(TargetDto targetDto) throws Exception {
        Target target = new Target();
        target.setPage(targetDto.getPage());
        target.setPriority(targetDto.getPriority());
        target.setStartDate(DateTime.parse(targetDto.getStartDate()).toDate());
        target.setEndDate(DateTime.parse(targetDto.getEndDate()).toDate());
        target.setUser(userService.getUserById(targetDto.getUserGuid()));
        target.setContent(contentService.getContentById(targetDto.getContentGuid()));
        return target;
    }
}
