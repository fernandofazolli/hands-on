package br.com.cit.handsonfafa.handson;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoController {

    private DemoService service;

    public DemoController(DemoService service){
        this.service = service;
    }

    @GetMapping(path = "/fafa")
    public Demo getMetodo(@RequestParam("name") String param){
        return service.save(param);
    }

    @GetMapping(path = "/fafaList")
    public List<Demo> getMetodo(){
        return service.findAll();
    }
}
