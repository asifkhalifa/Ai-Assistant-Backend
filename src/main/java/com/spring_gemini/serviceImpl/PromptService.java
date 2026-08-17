package com.spring_gemini.serviceImpl;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

@Service
public class PromptService {

    public String getSystemPrompt() throws IOException {

        ClassPathResource resource =
                new ClassPathResource("prompts/prompt.txt");

        return new String(
                resource.getInputStream().readAllBytes(),
                StandardCharsets.UTF_8
        );
    }
}