package com.cacheproxy;

import java.time.LocalDateTime;

public class CacheObject {
    private byte[] responseBody;
    private int statusCode;
    private LocalDateTime created;

    public CacheObject(byte[] responseBody, int statusCode) {
        this.responseBody = responseBody;
        this.statusCode = statusCode;
        this.created = LocalDateTime.now();
    }

    public byte[] getResponseBody() {
        return responseBody;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public LocalDateTime getCreated() {
        return created;
    }
}
