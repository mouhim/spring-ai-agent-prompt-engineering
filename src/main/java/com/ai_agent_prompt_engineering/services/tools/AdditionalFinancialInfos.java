package com.ai_agent_prompt_engineering.services.tools;

import org.springframework.context.annotation.Description;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service("additionalFinancialInfos")
@Description("""
        Get additiaonal financial infos
        - The number of subsidiaries of the given company
        """)
public class AdditionalFinancialInfos implements Function<AdditionalFinancialInfos.Request, AdditionalFinancialInfos.Response> {

    public record Request(String companyName) {};

    public record Response(String additionalFinancialInfos) {};

    @Override
    public Response apply(Request request) {
        System.out.println("========= additionalFinancialInfos Tool : " + request.companyName);
        return new Response("The number of subsidiaries");
    }
}
