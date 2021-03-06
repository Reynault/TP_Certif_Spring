package fr.certification.tp2.control;

import fr.certification.tp2.service.OperationsService;
import fr.certification.tp2.service.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping(value = "/adder", produces = "application/json")
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class OperationsController {
    private final OperationsService operationsService;

    @Autowired
    public OperationsController(OperationsService operationsService) {
        this.operationsService = operationsService;
    }

    @GetMapping("/add")
    public Result add(@RequestParam int a, @RequestParam int b) {
        return operationsService.add(a, b);
    }

    @GetMapping("/divide")
    public Result divide(@RequestParam int a, @RequestParam int b) {
        return operationsService.divide(a, b);
    }

    @GetMapping("/substract")
    public Result subtract(@RequestParam int a, @RequestParam int b) {
        return operationsService.substract(a, b);
    }

    @GetMapping("/multiply")
    public Result multiply(@RequestParam int a, @RequestParam int b) {
        return operationsService.multiply(a, b);
    }
}
