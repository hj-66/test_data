package com.mysite.testdata.category;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

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
}
