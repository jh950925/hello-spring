package hello.hellospring.repository;


import hello.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository{

    //복잡한 동적 쿼리는 Querydsl 라이브러리를 사용
    //select m from Member m where m.name =?
    @Override
    Optional<Member> findByName(String name);
//    Optional<Member> findByNameAndId(String name,id);
}
