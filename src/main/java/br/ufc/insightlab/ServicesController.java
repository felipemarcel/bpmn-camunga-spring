package br.ufc.insightlab;


import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.TaskService;
import org.camunda.bpm.engine.RepositoryService;
import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/services")
public class ServicesController {

    @Autowired
    private RuntimeService runtimeService;

    @Autowired
    private TaskService taskService;


    @GetMapping
    private ResponseEntity<?> findAll() {
        ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("camunda-spring");
        return ok(Arrays.asList("DETRAN", "SSPDS", "CAGECE", "SEDUC", "SEFAZ"));
    }


    @PostMapping("/{institution}")
    private ResponseEntity<?> getFormFrom(@PathVariable String institution) {
        runtimeService.setVariable("", "institution", institution);
        taskService.complete("");

        return ok().build();
    }

}
