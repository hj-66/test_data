package com.mysite.testdata.member;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

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

}
