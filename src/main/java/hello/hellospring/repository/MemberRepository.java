package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;


public interface MemberRepository {
    Member save(Member member); //save에 저장하여 밑에서 Optional로 받아오기

    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);

    List<Member> findAll();
}
