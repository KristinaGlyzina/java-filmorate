package ru.yandex.practicum.filmorate.testsController;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import ru.yandex.practicum.filmorate.FilmorateApplicationTests;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class UserControllerTest extends FilmorateApplicationTests {

    @Autowired
    private MockMvc mockMvc;
/*
    @Test
    public void updateUser_Success() throws Exception {
        int userId = 1;
        String requestBody = "{\n" +
                "  \"login\": \"doloreUpdate\",\n" +
                "  \"name\": \"est adipisicing\",\n" +
                "  \"id\": 1,\n" +
                "  \"email\": \"mail@yandex.ru\",\n" +
                "  \"birthday\": \"1976-09-20\"\n" +
                "}";

        // Выполнение запроса PUT

                .contentType(MediaType.APPLICATION_JSON)
                .content(requestBody));

        // Проверка статуса ответа
        resultActions.andExpect(status().isOk());

        // Проверка возвращаемых данных
        resultActions.andExpect(jsonPath("$.id").value(userId));
        resultActions.andExpect(jsonPath("$.login").value("doloreUpdate"));
        resultActions.andExpect(jsonPath("$.name").value("est adipisicing"));
        resultActions.andExpect(jsonPath("$.email").value("mail@yandex.ru"));
        resultActions.andExpect(jsonPath("$.birthday").value("1976-09-20"));
    } */
}
