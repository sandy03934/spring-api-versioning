package com.sandy03934.versioning.service;

public interface SearchServiceFactory {

        <T> ProfileService<T> getProfileService(String version);
}
