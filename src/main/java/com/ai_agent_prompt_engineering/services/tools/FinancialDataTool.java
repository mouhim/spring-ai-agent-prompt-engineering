package com.ai_agent_prompt_engineering.services.tools;

import org.springframework.context.annotation.Description;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service("financialDataTool")
@Description("""
        Get financial data about the comapny including :
        - The turnover of the last 3 years
        - The profit of the last 3 years
        - The value of the stock in the last  7 days
        """)
public class FinancialDataTool implements Function<FinancialDataTool.Request, FinancialDataTool.Response> {

    public record Request(String companyName) {
    }

    ;

    public record Response(double[] turnover,
                           double[] profit,
                           double[] stock) {
    }

    ;

    @Override
    public Response apply(Request request) {
        System.out.println("******************** financialDataTool invocation company : " + request.companyName);
        return new Response(
                new double[]{10000000, 200000000, 300000000},
                new double[]{1000, 20000, 300000},
                new double[]{450, 460, 480, 480, 320, 340, 250}
        );
    }

}
