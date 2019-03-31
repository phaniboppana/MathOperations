package com.company.MathOperations;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathOpsErrorController implements org.springframework.boot.web.servlet.error.ErrorController {

    private final static String PATH = "/error";

    @Override
    @RequestMapping(PATH)
    public String getErrorPath() {
        return "Invalid request path.";
    }
}
