package com.recceda.webeventcollector.web;


import com.recceda.webeventcollector.model.WebEvent;
import com.recceda.webeventcollector.service.WebEventTrackerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/track")
public class WebEventController {

    private final WebEventTrackerService webEventTrackerService;

    @PostMapping("/event")
    public void trackEvent(@RequestBody WebEvent event) {
        webEventTrackerService.track(event);
    }
}
