package com.github.leleact.jtest.spring.boot.web;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import javax.annotation.Resource;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@Slf4j
@SpringBootTest
@AutoConfigureMockMvc
public class SameUrlTests {

    @Resource
    private MockMvc mockMvc;

    @Test
    public void postTest() throws Exception {
        mockMvc.perform(post("/same_url").content("xx"))
               .andExpect(status().is2xxSuccessful())
               .andExpect(content().string("ok"));
    }

    @Test
    public void getTest() throws Exception {
        mockMvc.perform(get("/same_url"))
               .andExpect(status().is2xxSuccessful())
               .andExpect(content().string("same_url null"));
    }

}
