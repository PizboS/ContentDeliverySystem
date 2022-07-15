package org.example.api;

import org.example.entity.View;
import org.example.model.ViewedDto;

import java.util.List;

public interface InfoForAmsSender {
    void sendInfo(List<ViewedDto> viewedList);
}
