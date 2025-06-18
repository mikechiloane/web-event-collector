package com.recceda.webeventcollector.service;

import com.recceda.webeventcollector.model.WebEvent;
import com.recceda.webeventcollector.web.response.EventTrackResponse;

public interface WebEventTracker {

    /**
     * Tracks a web event.
     *
     * @param event the web event to track
     * @return a response indicating the result of the tracking operation
     */
    EventTrackResponse track(WebEvent event);
}
