package org.example.model;

import lombok.Data;
import java.util.UUID;

@Data
public class TargetDto {
    private UUID guid;

    private UUID userGuid;

    private UUID contentGuid;

    private String page;

    private int priority;

    private String startDate;

    private String endDate;
}
