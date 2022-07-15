package org.example.entity;

import com.vladmihalcea.hibernate.type.json.JsonType;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;
import java.util.UUID;

@TypeDef(name = "json", typeClass = JsonType.class)

@Data
@Entity
@Table(name = "content")
public class Content {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private UUID guid;
    @Type(type = "json")
    @Column(name = "data", columnDefinition = "json")
    private ContentData data;
}
