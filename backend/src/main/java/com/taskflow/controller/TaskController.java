package com.taskflow.controller;
import com.taskflow.model.Task; import com.taskflow.repository.TaskRepository; import lombok.RequiredArgsConstructor; import org.springframework.web.bind.annotation.*; import java.util.*;
@RestController @RequestMapping("/api/tasks") @RequiredArgsConstructor public class TaskController{
private final TaskRepository repo;
@GetMapping public List<Task> all(){return repo.findAll();}
@GetMapping("/{id}") public Task one(@PathVariable Long id){return repo.findById(id).orElseThrow();}
@PostMapping public Task create(@RequestBody Task t){if(t.getStatus()==null)t.setStatus(Task.Status.TODO);if(t.getPriority()==null)t.setPriority(Task.Priority.MEDIUM);return repo.save(t);}
@PutMapping("/{id}") public Task update(@PathVariable Long id,@RequestBody Task x){Task t=repo.findById(id).orElseThrow();t.setTitle(x.getTitle());t.setDescription(x.getDescription());t.setStatus(x.getStatus());t.setPriority(x.getPriority());t.setDueDate(x.getDueDate());t.setAssigneeId(x.getAssigneeId());t.setProject(x.getProject());return repo.save(t);}
@DeleteMapping("/{id}") public void delete(@PathVariable Long id){repo.deleteById(id);}
}
