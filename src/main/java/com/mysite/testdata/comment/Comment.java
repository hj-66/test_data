package com.mysite.testdata.comment;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Comment {

    @Id
    @GeneratedValue()
    private int id;

    @Column(length = 100)
    private String content;

    @Column(length = 100)
    private String author;

    private int postId;

    private LocalDateTime createDate;
    private LocalDateTime modifyDate;
}
