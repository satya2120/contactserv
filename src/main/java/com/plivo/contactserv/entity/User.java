package com.plivo.contactserv.entity;

import javax.persistence.*;

@Entity
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
