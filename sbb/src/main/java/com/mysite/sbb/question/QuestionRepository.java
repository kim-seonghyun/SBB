package com.mysite.sbb.question;

import com.mysite.sbb.question.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// QuestionRepository 객체가 생성될때 JPA가 메서드를 분석하여 쿼리를 만들어 실행.
public interface QuestionRepository extends JpaRepository<Question, Integer> {
    Question findBySubject(String subject); //따라서 구현하지 않아도 분석해서 쿼리를 만들어준다. findBy + 엔터티 속성명 쓰기
    Question findBySubjectAndContent(String subject, String content);

    List<Question> findBySubjectLike(String subject);
}
