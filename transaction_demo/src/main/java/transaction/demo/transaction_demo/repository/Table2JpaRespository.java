package transaction.demo.transaction_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import transaction.demo.transaction_demo.model.Table2;

public interface Table2JpaRespository extends JpaRepository<Table2, Long>{

    Table2 findByName(String name);
}
