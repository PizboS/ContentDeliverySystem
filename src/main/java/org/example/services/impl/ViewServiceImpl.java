package org.example.services.impl;

import org.example.entity.View;
import org.example.mapper.ViewMapper;
import org.example.model.ViewedDto;
import org.example.repository.ViewRepository;
import org.example.services.ViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ViewServiceImpl implements ViewService {
    @Autowired
    private ViewMapper viewMapper;
    @Autowired
    private ViewRepository viewRepository;

    @Override
    public View getViewById(UUID id) {
        return viewRepository.getOne(id);
    }

    @Override
    public void saveView(ViewedDto viewedDto) {
        View view = viewMapper.map(viewedDto);
        view.setSent(false);
        viewRepository.save(view);
    }

    @Override
    public List<View> getViewsForAMS() {
        return viewRepository.getViewsBySentFalse();
    }
}
