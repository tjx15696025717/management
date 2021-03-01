package com.chongqing.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class News {
    private Long id;

    private Long releaseTime;

    private String publisher;

    private Long publisherId;

    private String author;

    private String content;

}