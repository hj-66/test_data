package com.mysite.testdata.member;

import com.mysite.testdata.like.Like;
import com.mysite.testdata.post.Post;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Getter
@Setter
public class Member {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private int id;

    private String username;
    private String password;
    private String nickname;
    private String email;
    private boolean role;

    private LocalDate createDate;

    @OneToMany(mappedBy = "member", cascade = {CascadeType.REMOVE, CascadeType.PERSIST})
    private List<Post> post;

    @ManyToMany
    private List<Like> like;
}
