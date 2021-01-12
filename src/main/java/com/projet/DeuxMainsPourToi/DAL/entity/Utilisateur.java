package com.projet.DeuxMainsPourToi.DAL.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter @Setter
@NoArgsConstructor
public class Utilisateur implements Serializable {

    @Id
    @Column(name = "id_utilisateur")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    @Size(max = 50)
    private String nom;

    @Column(nullable = false)
    @Size(max = 50)
    private String prenom;

    @Column(nullable = false)
    @Size(max = 50)
    private String pseudo;

    @Column(nullable = false)
    @Size(max = 100)
    private String email;

    @Column(nullable = false, columnDefinition = "blob")
    private byte[] password;

    @Column
    @Size(max = 20)
    private String tel;

    @Column
    @Size(max = 20)
    private String gsm;

    @Column(nullable = false)
    @Size(max = 50)
    private String rue;

    @Column
    @Size(max = 20)
    private String num;

    @Column
    @Size(max = 20)
    private String boite;

    @Column(nullable = false)
    @Size(max = 20)
    private String cp;

    @Column(nullable = false)
    @Size(max = 50)
    private String loc;

    @Column(name = "compl_adr")
    @Size(max = 100)
    private String complAdr;

    @Column(name = "date_de_naiss")
    @Past
    private Date dateNaiss;

    @Column(columnDefinition = "boolean default false")
    private boolean admin;

    @Column(nullable = false)
    private Date inscrit;

    @Column(nullable = false)
    private Date supprime;

}