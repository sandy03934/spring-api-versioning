package com.sandy03934.versioning.rest;

import com.sandy03934.versioning.service.SearchServiceFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeProfileController {

        final SearchServiceFactory factory;

        public EmployeeProfileController(SearchServiceFactory factory) {
                this.factory = factory;
        }

        @GetMapping("/users")
        public <T> ResponseEntity<List<T>> getEmployeeProfileController(@RequestParam(defaultValue = "1") String version) {
                List<T> users = factory.<T>getProfileService(version).getProfile();
                return new ResponseEntity<>(users, HttpStatus.OK);
        }
}
