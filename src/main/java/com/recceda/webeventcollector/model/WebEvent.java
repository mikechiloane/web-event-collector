package com.recceda.webeventcollector.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.time.Instant;
import java.util.List;


@Document(collection = "web_events")
@Setter
@Getter
@NoArgsConstructor
public class WebEvent {

    @MongoId
    private String id;
    private Meta meta;
    private List<Batch> batch;
    @CreatedDate
    private Instant timestamp;
}
