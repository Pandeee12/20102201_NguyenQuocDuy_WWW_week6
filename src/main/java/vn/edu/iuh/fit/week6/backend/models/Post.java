package vn.edu.iuh.fit.week6.backend.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.util.Set;
import java.util.LinkedHashSet;

@Getter
@Setter
@Entity
@Table(name = "post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_id",nullable = false)
    private Long id;
    @Column(name = "title",nullable = false,length = 75)
    private String title;
    @Column(name = "meta_title",length = 100)
    private String metaTitle;
    @Column(name = "summary")
    private String summary;
    @Column(name = "published",nullable = false)
    private boolean published = false;
    @Column(name = "create_at",nullable = false)
    private LocalDate createdAt;
    @Column(name = "update_at",nullable = false)

    private LocalDate updateAt;
    @Column(name = "published_at",nullable = false)

    private LocalDate publishedAt;
    @Column(name = "content")

    private String content;
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "parent_id")
    private Post parent;
    @OneToMany(mappedBy = "post")
    private Set<PostComment> postComments = new LinkedHashSet<>();
    @OneToMany(mappedBy = "parent")
    private Set<Post> posts = new LinkedHashSet<>();
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "authorId",nullable = false)
    private User author;



}
