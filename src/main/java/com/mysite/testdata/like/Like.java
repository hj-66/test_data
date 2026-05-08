package com.mysite.testdata.like;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Getter
@Setter
public class Like {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private int id;
    private int postId;
    private int memberId;
}
