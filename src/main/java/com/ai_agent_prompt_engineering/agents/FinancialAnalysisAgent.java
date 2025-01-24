package com.ai_agent_prompt_engineering.agents;

import com.ai_agent_prompt_engineering.annotations.AiAgent;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.hilla.BrowserCallable;
import org.springframework.ai.chat.client.ChatClient;

import java.util.Objects;

@BrowserCallable
@AnonymousAllowed
@AiAgent
public class FinancialAnalysisAgent {

    private final ChatClient chatClient;

    String systemPrompt = """
            Give me financial details for the given company
            i need financial report based on actual data from the net
            your answer should include the name of the CEO, number of employees in all over the wolrd and financial reports
            also add concise conclusion about financial analysis
            """;

    private String[] tools = {"companyInformation", "financialDataTool", "additionalFinancialInfos"};

    public FinancialAnalysisAgent(ChatClient.Builder chatClient) {
        this.chatClient = chatClient
                .defaultSystem(systemPrompt)
                .defaultFunctions(tools)
                .build();
    }

    public String financialAnalysisReport(String companyName) {
        return Objects.requireNonNull(chatClient.prompt()
                .user("Company name : " + companyName)
                .call().content());
    }


}
