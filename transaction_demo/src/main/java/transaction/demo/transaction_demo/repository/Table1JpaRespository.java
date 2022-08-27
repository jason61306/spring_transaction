package transaction.demo.transaction_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import transaction.demo.transaction_demo.model.Table1;

public interface Table1JpaRespository extends JpaRepository<Table1, Long>{

    Table1 findByName(String name);
        
}
