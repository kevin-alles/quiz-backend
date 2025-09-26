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
public class AnswerControllerIntegrationTests {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetAnswerById() throws Exception {
        mockMvc.perform(
                MockMvcRequestBuilders.get("/answers/1")
        ).andExpect(
                MockMvcResultMatchers.status().isOk()
        ).andExpect(
                MockMvcResultMatchers.content().string("Answer details")
        );
    }

    @Test
    public void testGetAnswersByQuestionId() throws Exception {
        mockMvc.perform(
                MockMvcRequestBuilders.get("/answers/questions/1")
        ).andExpect(
                MockMvcResultMatchers.status().isOk()
        ).andExpect(
                MockMvcResultMatchers.content().string("List of answers for the question")
        );
    }
}
