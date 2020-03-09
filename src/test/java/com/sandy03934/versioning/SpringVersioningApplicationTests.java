package com.sandy03934.versioning;

import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
public class SpringVersioningApplicationTests {

        @Autowired
        MockMvc mockMvc;

        @Test
        void contextLoads() {
        }

        @SneakyThrows
        @Test
        public void whenSearchedProfile_thenReturnUsers() {
                mockMvc.perform(get("/users"))
                    .andExpect(status().isOk());
        }

        @SneakyThrows
        @Test
        public void whenSearchedProfileV2_thenReturnUsers() {
                mockMvc.perform(get("/users?version=2"))
                    .andExpect(status().isOk());
        }



}
