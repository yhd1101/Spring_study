package com.example.demo.model;

import com.sun.istack.NotNull;
import lombok.*;
import org.hibernate.annotations.Comment;

import javax.persistence.*;

@Getter
@Setter
@Entity //테이블생성
@AllArgsConstructor //생성자 인수에 다넣기
@NoArgsConstructor
@Builder
@Table(name = "tb_board")

public class Board {
    @Id //pk
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column()
    @Comment("제목")
    @NotNull //데이터가있어야함
    private String title;
    @Column
    @NotNull
    @Comment("내용")
    private String content;

}
