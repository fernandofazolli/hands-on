package br.com.cit.handsonfafa.handson;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class DemoService {

    private DemoRepository repository;

    public DemoService(DemoRepository repository) {
        this.repository = repository;
    }

    public Demo save(String param) {
        Demo demo = new Demo();
        demo.setName(param);
        return repository.save(demo);
    }

    public List<Demo> findAll() {
        List<Demo> retorno = new ArrayList<>();
        repository.findAll().iterator().forEachRemaining(retorno::add);
        return retorno;
    }
}
