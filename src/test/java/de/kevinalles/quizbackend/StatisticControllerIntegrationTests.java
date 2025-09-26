package de.kevinalles.quizbackend;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@AutoConfigureMockMvc
public class StatisticControllerIntegrationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testAddStatistics() throws Exception {
        mockMvc.perform(
                MockMvcRequestBuilders.put("/statistics/1")
                        .param("professionGroupID", "1")
                        .param("answerID", "1")
        ).andExpect(
                MockMvcResultMatchers.status().isOk()
        ).andExpect(
                MockMvcResultMatchers.content().string("Statistics added")
        );
    }

    @Test
    public void testGetStatisticsByQuestionId() throws Exception {
        mockMvc.perform(
                MockMvcRequestBuilders.get("/statistics/1")
        ).andExpect(
                MockMvcResultMatchers.status().isOk()
        ).andExpect(
                MockMvcResultMatchers.content().string("Statistics details")
        );
    }

}
