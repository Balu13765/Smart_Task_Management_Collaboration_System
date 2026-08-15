package com.taskflow.model;
import jakarta.persistence.*; import lombok.*; import java.time.LocalDateTime;
@Entity @Table(name="comments") @Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Comment { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; private Long taskId; private Long userId; @Column(length=2000) private String message; private LocalDateTime createdAt; }
