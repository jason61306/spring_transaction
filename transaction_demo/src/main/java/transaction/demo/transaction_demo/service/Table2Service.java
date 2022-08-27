package transaction.demo.transaction_demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import transaction.demo.transaction_demo.model.Table2;
import transaction.demo.transaction_demo.repository.Table2JpaRespository;

@Service
public class Table2Service {

    @Autowired
    private Table2JpaRespository table2JpaRespository;

    public Table2 findByName(String name){
        return table2JpaRespository.findByName(name);
    }

    
    @Transactional(propagation = Propagation.REQUIRED)
    public void save_REQUIRED(Table2 table2){
        table2JpaRespository.save(table2);       
        throw new RuntimeException();
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void save_REQUIRED_success(Table2 table2){
        table2JpaRespository.save(table2);       
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void save_REQUIRES_NEW(Table2 table2){
        table2JpaRespository.save(table2);       
        throw new RuntimeException();
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void save_REQUIRES_NEW_success(Table2 table2){
        table2JpaRespository.save(table2);               
    }


    public List<Table2> findAll() {
        return table2JpaRespository.findAll();
    }
}
