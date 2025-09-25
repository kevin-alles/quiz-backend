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
public class QuestionControllerIntegrationTests {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetAllQuestions() throws Exception {
        mockMvc.perform(
                MockMvcRequestBuilders.get("/questions")
        ).andExpect(
                MockMvcResultMatchers.status().isOk()
        ).andExpect(
                MockMvcResultMatchers.content().string("List of all questions")
        );
    }

    @Test
    public void testGetQuestionById() throws Exception {
        mockMvc.perform(
                MockMvcRequestBuilders.get("/questions/1")
        ).andExpect(
                MockMvcResultMatchers.status().isOk()
        ).andExpect(
                MockMvcResultMatchers.content().string("Question details")
        );
    }

    @Test
    public void testGetQuestionByNumber() throws Exception {
        mockMvc.perform(
                MockMvcRequestBuilders.get("/questions/number/1")
        ).andExpect(
                MockMvcResultMatchers.status().isOk()
        ).andExpect(
                MockMvcResultMatchers.content().string("Question details by number")
        );
    }
}
