package com.mysite.testdata.like;

import com.mysite.testdata.member.Member;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

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

    @ManyToMany
    private List<Member> member;
}
