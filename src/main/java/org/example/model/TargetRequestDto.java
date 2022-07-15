package org.example.model;

import lombok.Data;

import java.util.UUID;

@Data
public class TargetRequestDto {
    private UUID userGuid;
    private String page;
}
