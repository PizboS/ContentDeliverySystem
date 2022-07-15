package org.example.services.impl;

import org.example.entity.Content;
import org.example.repository.ContentRepository;
import org.example.services.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ContentServiceImpl implements ContentService {
    @Autowired
    private ContentRepository contentRepository;

    @Override
    public Content getContentById(UUID id) {
        return contentRepository.getOne(id);
    }

    @Override
    public List<Content> findAll(){
        return contentRepository.findAll();
    }
    @Override
    public void saveContent(Content content){
        contentRepository.save(content);
    }
    @Override
    public  void saveAll(List<Content> contentList){
        contentRepository.saveAll(contentList);
    }
    @Override
    public void deleteContent(Content content){
        contentRepository.delete(content);
    }
}
