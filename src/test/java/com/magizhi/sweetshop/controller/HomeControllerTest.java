package com.magizhi.sweetshop.controller;

import com.magizhi.sweetshop.service.Catalog;
import com.magizhi.sweetshop.service.DbCatalog;
import com.magizhi.sweetshop.service.InMemoryCatalog;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import javax.persistence.Access;
import static org.junit.jupiter.api.Assertions.*;
import  static org.springframework.test.web.servlet.MockMvcBuilder.*;
import  static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;

@WebMvcTest(HomeController.class)
class HomeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    DbCatalog dbCatalog;
    @Test
    public void shouldHomeControllerReturn_IndexPage_withModel() throws Exception {

            mockMvc.perform(get("/listItems"))
                    .andDo(print())
                    .andExpect(model().attributeExists("items"))
                    .andExpect(status().isOk())
                    ;
    }
}