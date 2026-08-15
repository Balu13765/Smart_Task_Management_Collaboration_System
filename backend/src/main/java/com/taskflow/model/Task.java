package com.taskflow.model;
import jakarta.persistence.*; import lombok.*; import java.time.LocalDate;
@Entity @Table(name="tasks") @Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Task { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; @Column(nullable=false) private String title; @Column(length=2000) private String description; @Enumerated(EnumType.STRING) private Status status; @Enumerated(EnumType.STRING) private Priority priority; private LocalDate dueDate; private Long assigneeId; private Long createdBy; private String project; public enum Status{TODO,IN_PROGRESS,DONE} public enum Priority{LOW,MEDIUM,HIGH} }
