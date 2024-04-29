package org.zerock.springex.sample;

import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@ToString
@RequiredArgsConstructor
public class SampleService {

    private final SampleDAO sampleDAO;

//    // 생성자 주입
//    @Autowired
//    SampleService(SampleDAO sampleDAO) {
//        this.sampleDAO = sample}
}
