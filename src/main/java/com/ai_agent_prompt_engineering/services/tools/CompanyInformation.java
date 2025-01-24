package com.ai_agent_prompt_engineering.services.tools;

import org.springframework.context.annotation.Description;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service("companyInformation")
@Description("""
        Get some information about the given company
        - The founded year
        - The country of the company
        - The domain of the company
        - The CEO of the company
        """)
public class CompanyInformation implements Function<CompanyInformation.Request, CompanyInformation.Response> {

    public record Request(String companyName) {};

    public record Response(int foundedYear, String country, String domain, String cao) {};

    @Override
    public Response apply(Request request) {
        System.out.println("========= companyInformation company : " + request.companyName);
        return new Response(1990, "Paris", "Technology of information", "Aiman EZZAT");
    }

}
