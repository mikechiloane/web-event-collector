package com.recceda.webeventcollector.repository;

import com.recceda.webeventcollector.model.WebEvent;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WebEventRepository extends MongoRepository<WebEvent, String> {

}
