package transaction.demo.transaction_demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import transaction.demo.transaction_demo.model.Member;
import transaction.demo.transaction_demo.repository.MemberJpaRespository;

@RestController
@RequestMapping("/member")
public class MemberController {

    @Autowired
    private MemberJpaRespository memberJpaRespository;

    @GetMapping(value = "/all")
    public List<Member> findAll() {
        return memberJpaRespository.findAll();
    }

    @PostMapping(value = "/save")
    public Member save(@RequestBody final Member member) {
        return memberJpaRespository.save(member);
    }


}
