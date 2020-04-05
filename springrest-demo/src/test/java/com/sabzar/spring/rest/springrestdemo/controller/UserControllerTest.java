package com.sabzar.spring.rest.springrestdemo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(UserController.class)
class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void greeting() throws  Exception{

       mockMvc.perform(get("/greeting"))
                .andDo(print())
                .andExpect(status().isOk()).andExpect(content().string(containsString("Welcome to the DevOPP")));
    }

    @Test
    void greetingWithName() throws  Exception{
        String name ="sabzar";
        mockMvc.perform(get("/greeting/"+name))
                .andDo(print())
                .andExpect(status().isOk()).andExpect(content().string(containsString("Welcome to the DevOPP "+name)));
    }


}