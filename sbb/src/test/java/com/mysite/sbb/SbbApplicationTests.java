package com.mysite.sbb;

import com.mysite.sbb.question.Question;
import com.mysite.sbb.question.QuestionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SbbApplicationTests {

	@Autowired //questionRepository 주입.
	private QuestionRepository questionRepository;

//	@Test //테스트 메서드임을 명시, insert 구현.
//	void testJpa(){
//		Question q1 = new Question();
//		q1.setSubject("sbb가 무엇인가요?");
//		q1.setContent("sbb에 대해서 알고 싶습니다");
//		q1.setCreateDate(LocalDateTime.now());
//		this.questionRepository.save(q1);
//
//		Question q2 = new Question();
//		q2.setSubject("스프링부터트 모델 질문입니다.");
//		q2.setContent("id는 자동으로 생성되나요?");
//		q2.setCreateDate(LocalDateTime.now());
//		this.questionRepository.save(q2);
//	}
//	@Test
//	void testJpa() {
//		List<Question> all = this.questionRepository.findAll();
//		assertEquals(2, all.size()); //assertEquals(기대값, 실제값)
//
//		Question q = all.get(0);
//		assertEquals("sbb가 무엇인가요?", q.getSubject());
//
//	}
	@Test
	void testJpa() {
		List<Question> qList = this.questionRepository.findBySubjectLike("sbb%");
		Question q = qList.get(0);
		assertEquals("sbb가 무엇인가요?", q.getSubject());
	}

}
