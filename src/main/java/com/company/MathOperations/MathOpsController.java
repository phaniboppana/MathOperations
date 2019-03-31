package com.company.MathOperations;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MathOpsController {

    private static float value = 0;

    @RequestMapping(value = "/calculate",
            method = RequestMethod.GET,
            produces = "application/json")
    public ResponseEntity performMathOps(@RequestParam("operation") final String operation,
                                         @RequestParam("value") final float requestValue) {

        if (operation.equalsIgnoreCase("addition")) {
            value = value + requestValue;
        } else if (operation.equalsIgnoreCase("subtraction")) {
            value = value - requestValue;
        } else if (operation.equalsIgnoreCase("multiplication")) {
            value = value * requestValue;
        } else {
            return ResponseEntity.badRequest().body("Unsupported Operation:" + operation);
        }

        return ResponseEntity.ok().body("Current Value: " + value);
    }
}
