package com.mysite.sbb.question;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

//그럼 service는 controller에서 호출한 repository 부분만 똑 떼서 가져온거인가?
@RequiredArgsConstructor
@Service //스프링의 서비스로 만들기.
public class QuestionService {
    private final QuestionRepository questionRepository;

    public List<Question> getList() {
        return this.questionRepository.findAll();
    }
}
