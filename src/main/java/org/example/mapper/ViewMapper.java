package org.example.mapper;

import org.example.entity.View;
import org.example.model.ViewedDto;

public interface ViewMapper {
    View map(ViewedDto viewedDto);
}
