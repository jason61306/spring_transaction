package transaction.demo.transaction_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import transaction.demo.transaction_demo.model.Member;

public interface MemberJpaRespository extends JpaRepository<Member, Long>{
    
}
