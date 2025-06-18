package com.recceda.webeventcollector.service;

import com.recceda.webeventcollector.model.WebEvent;
import com.recceda.webeventcollector.repository.WebEventRepository;
import com.recceda.webeventcollector.web.response.EventTrackResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
@RequiredArgsConstructor
@Slf4j
public class WebEventTrackerService implements WebEventTracker {

    private final WebEventRepository webEventRepository;

    @Override
    public EventTrackResponse track(WebEvent event) {
        log.info("Tracking web event");
        checkForDownloadActions(event);
        CompletableFuture.runAsync(() -> {
            webEventRepository.save(event);
        });

        EventTrackResponse response = new EventTrackResponse();
        response.setStatus("success");
        response.setKey(event.getId());
        return response;
    }

    private void checkForDownloadActions(WebEvent event) {
        boolean hasDownloadAction= event.getBatch().stream()
                .anyMatch(item -> item.getActionName().equals("Download CV"));
        if (hasDownloadAction) {
            log.info("Download action detected for event");
        }
    }

}
