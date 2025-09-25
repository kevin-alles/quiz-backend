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
public class ReachableControllerIntegrationTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testReachableEndpoint() throws Exception {
        // This test will pass if the application context loads successfully,
        // indicating that the /reachable endpoint is available.

        mockMvc.perform(
                MockMvcRequestBuilders.post("/reachable")
        ).andExpect(
                MockMvcResultMatchers.status().isOk()
        ).andExpect(
                MockMvcResultMatchers.content().string("Backend is reachable!")
        );
    }
}
