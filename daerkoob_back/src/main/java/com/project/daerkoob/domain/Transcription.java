package com.project.daerkoob.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name = "transcription")
public class Transcription {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "transcription_id")
    private Long id;
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "book_id")
    private Long bookId;
    @Column(name = "thumb")
    private Long thumb;
    @Column(name = "star")
    private Double star;
}
