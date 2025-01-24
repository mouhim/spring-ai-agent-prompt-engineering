package com.ai_agent_prompt_engineering.controllers;

import com.ai_agent_prompt_engineering.agents.FinancialAnalysisAgent;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prompt-engineering")
public class AiAgentController {

    private final FinancialAnalysisAgent financialAnalysisAgent;

    public AiAgentController(FinancialAnalysisAgent financialAnalysisAgent) {
        this.financialAnalysisAgent = financialAnalysisAgent;
    }

    @GetMapping(value = "/financialAnalysis", produces = MediaType.TEXT_MARKDOWN_VALUE)
    public String askAgentFinancialReportDetails(String company) {
        return financialAnalysisAgent.financialAnalysisReport(company);
    }


}
