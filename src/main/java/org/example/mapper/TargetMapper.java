package org.example.mapper;

import org.example.entity.Target;
import org.example.model.TargetDto;

public interface TargetMapper  {
    Target map(TargetDto targetDto) throws Exception;
}
