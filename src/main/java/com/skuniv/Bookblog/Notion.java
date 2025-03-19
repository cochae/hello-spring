package com.skuniv.Bookblog;

import jakarta.persistence.*;
import lombok.ToString;

@Entity
@ToString
public class Notion {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;
    public String 글제목;
    public String 날짜;
}

