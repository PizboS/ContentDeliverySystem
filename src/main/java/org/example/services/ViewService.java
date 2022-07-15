package org.example.services;

import org.example.entity.View;
import org.example.model.ViewedDto;

import java.util.List;
import java.util.UUID;

public interface ViewService {
    View getViewById(UUID id);

    void saveView(ViewedDto viewedDto);

    List<View> getViewsForAMS();
}
