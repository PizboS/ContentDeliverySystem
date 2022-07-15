package org.example.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private UUID guid;

    @Column(name = "systemname")
    private String systemName;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;
    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Target> targetList;

}

