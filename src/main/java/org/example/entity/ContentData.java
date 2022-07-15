package org.example.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class ContentData implements Serializable {
    private String header;
    private String  backgroundImg;
    private String  text;
}
