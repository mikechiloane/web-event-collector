package com.recceda.webeventcollector.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class Batch {
    private String type;
    private String actionName;
    private Element element;
    private WebEvent event;
    private Page page;
    private String timestamp;
    private String userId;
    private String sessionId;
    private String deviceId;

}