package com.mysite.testdata.category;

import com.mysite.testdata.post.Post;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Getter
@Setter
public class Category {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private int id;

    @Column(length = 100)
    private String name;

    @OneToMany(mappedBy = "category")
    private List<Post> post;
}
