package com.sandy03934.versioning.service.impl.v1;

import com.sandy03934.versioning.dto.User;
import com.sandy03934.versioning.service.ProfileService;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service("profile1")
public class ProfileServiceImpl implements ProfileService<User> {

        @Override
        public List<User> getProfile() {
                return Collections.singletonList(new User("Jack Ryan", "abc@def.com"));
        }
}
