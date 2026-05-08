package com.mysite.testdata.comment;

import com.mysite.testdata.post.Post;
import jakarta.persistence.*;
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

    @ManyToOne(fetch = FetchType.LAZY)
    private Post post;
}
