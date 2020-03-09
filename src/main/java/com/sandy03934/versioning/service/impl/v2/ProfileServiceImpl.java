package com.sandy03934.versioning.service.impl.v2;

import com.sandy03934.versioning.dto.UserV2;
import com.sandy03934.versioning.service.ProfileService;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service("profile2")
public class ProfileServiceImpl implements ProfileService<UserV2> {

        @Override
        public List<UserV2> getProfile() {
                return Collections.singletonList(new UserV2("Jack", "Ryan", "abc@def.com", "12345"));
        }
}
