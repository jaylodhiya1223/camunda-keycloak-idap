package com.camundakeycloak.identity.controller;


import com.camundakeycloak.identity.model.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class ModelController {
    java.util.logging.Logger logger =
            java.util.logging.Logger.getLogger(this.getClass().getName());

    @PostMapping("/message")
    public Model createMessage(@RequestBody Model model) {
        logger.info("-------Message Creator Initialized-------");

        Model m = new Model();
        m.setMessage(model.getMessage());
        m.setName(model.getName());

        logger.info("Message created --> " + m.toString());
        return m;
    }
}
