package com.sandy03934.versioning.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserV2 {

        private String firstName;

        private String lastName;

        private String email;

        private String phoneNumber;
}
