package transaction.demo.transaction_demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import transaction.demo.transaction_demo.model.Table1;
import transaction.demo.transaction_demo.repository.Table1JpaRespository;

@Service
public class Table1Service {

    @Autowired
    private Table1JpaRespository table1JpaRespository;

    public Table1 findByName(String name){
        return table1JpaRespository.findByName(name);
    }

    public void save(Table1 table1){
        table1JpaRespository.save(table1);               
    }

    public List<Table1> findAll() {
        return table1JpaRespository.findAll();
    }
}