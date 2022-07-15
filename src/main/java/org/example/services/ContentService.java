package org.example.services;

import org.example.entity.Content;

import java.util.List;
import java.util.UUID;


public interface ContentService {
    Content getContentById(UUID id);

    List<Content> findAll();

    void saveContent(Content content);

    void saveAll(List<Content> contentList);

    void deleteContent(Content content);

}
