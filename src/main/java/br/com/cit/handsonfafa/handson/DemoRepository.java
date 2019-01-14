package br.com.cit.handsonfafa.handson;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemoRepository extends CrudRepository<Demo, Integer> {
}
