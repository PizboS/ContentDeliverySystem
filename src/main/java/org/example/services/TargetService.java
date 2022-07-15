package org.example.services;

import org.example.entity.Target;
import org.example.entity.User;
import org.example.model.TargetDto;
import org.example.model.TargetRequestDto;

import java.util.List;
import java.util.UUID;

public interface TargetService {

    Target getTargetById(UUID id);

    List<Target> findAll();

    void saveTarget(TargetDto target);

    void saveAll(List<Target> targetList);

    void deleteTarget(Target target);

    List<Target> getTargetsByUserAndPage(TargetRequestDto requestDto);
}
