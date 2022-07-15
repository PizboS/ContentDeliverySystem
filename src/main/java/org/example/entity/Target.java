package org.example.entity;

import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Data
@Entity
@Table(name = "target")
public class Target {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private UUID guid;

    @ManyToOne
    @JoinColumn(name = "user_guid")
    private User user;

    @ManyToOne
    @JoinColumn(name = "content_guid")
    private Content content;

    @Column(name = "page")
    private String page;

    @Column(name = "priority")
    private Integer priority;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "end_date")
    private Date endDate;

}
