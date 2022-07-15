package org.example.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;
@Data
@Entity
public class View {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private UUID guid;

    @Column(name = "user_guid")
    private String userGuid;

    @Column(name = "content_guid")
    private String contentGuid;

    @Column(name = "sent")
    private boolean sent;
}
