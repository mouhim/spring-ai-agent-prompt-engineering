package com.ai_agent_prompt_engineering;

import com.vaadin.flow.component.page.AppShellConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AiAgentPromptEngineeringApplication implements AppShellConfigurator {

    public static void main(String[] args) {
        SpringApplication.run(AiAgentPromptEngineeringApplication.class, args);
    }
}
