package com.plivo.contactserv.entity;

import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Embeddable
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "team_Sequence")
    @SequenceGenerator(name = "team_Sequence", sequenceName = "TEAM_SEQ")
    private Long id;

    @Column(name = "userName")
    private String userName;

    @Column(name = "password")
    private String password;
}
