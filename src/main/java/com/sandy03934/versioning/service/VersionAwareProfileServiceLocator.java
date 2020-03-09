package com.sandy03934.versioning.service;

import com.sandy03934.versioning.dto.SearchRequest;

public interface VersionAwareProfileServiceLocator {

        ProfileService locateProfileService(String version, SearchRequest request);
}
