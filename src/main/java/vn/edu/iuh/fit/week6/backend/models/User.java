package vn.edu.iuh.fit.week6.backend.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.checkerframework.checker.units.qual.C;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id",nullable = false)
    private Long id;
    @Column(name = "first_name",length = 50)
    private String firstName;
    @Column(name = "middle_name",length = 50)
    private String middleName;
    @Column(name = "last_name",length = 50)
    private String lastName;
    @Column(name = "mobile",length = 15)
    private String mobile;
    @Column(name = "email",length = 50)
    private String email;
    @Column(name = "password_hash",nullable = false,length = 32)
    private String passwordHash;
    @Column(name = "registered_at",nullable = false)
    private LocalDate registeredAt;
    @Column(name = "last_login")
    private LocalDate lastLogin;
    @Column(name = "intro")
    private String intro;
    @Column(name = "profile")
    private String profile;
    @OneToMany(mappedBy = "author")
    private Set<Post> posts = new LinkedHashSet<>();
    @OneToMany(mappedBy = "user")
    private Set<PostComment> comments = new LinkedHashSet<>();





}
