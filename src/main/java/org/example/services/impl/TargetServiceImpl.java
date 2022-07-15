package org.example.services.impl;

import org.example.entity.Target;
import org.example.entity.User;
import org.example.mapper.TargetMapper;
import org.example.model.TargetDto;
import org.example.model.TargetRequestDto;
import org.example.repository.TargetRepository;
import org.example.services.TargetService;
import org.example.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class TargetServiceImpl implements TargetService {
    @Autowired
    private TargetMapper targetMapper;
    @Autowired
    private UserService userService;
    @Autowired
    private TargetRepository targetRepository;
    @Override
    public Target getTargetById(UUID id) {
        return targetRepository.getOne(id);
    }

    @Override
    public List<Target> findAll(){
        return targetRepository.findAll();
    }
    @Override
    public void saveTarget(TargetDto targetDto){
        try {
            Target target = targetMapper.map(targetDto);
            targetRepository.save(target);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    @Override
    public  void saveAll(List<Target> targetList){
        targetRepository.saveAll(targetList);
    }
    @Override
    public void deleteTarget(Target target){
        targetRepository.delete(target);
    }


    @Override
    public List<Target> getTargetsByUserAndPage(TargetRequestDto requestDto) {
        User user = userService.getUserById(requestDto.getUserGuid());
        return targetRepository.getTargetsByUserAndPage(user, requestDto.getPage()).stream()
                .sorted((o1, o2) -> o2.getPriority().compareTo(o1.getPriority()))
                .collect(Collectors.toList());

    }
}
