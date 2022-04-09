package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.ArrayList;
import java.util.List;

@Controller
public class UsersController
{
    @RequestMapping("/users")
    @ResponseBody
    public Object ShowUsers(
            @RequestParam(required = false) Long id,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) Integer age
    ) {
        List<UserEntity> users = new ArrayList<>();
        users.add(new UserEntity(1L,"John",  26));
        users.add(new UserEntity(2L, "Kate",  23));
        return users;
    }

    @RequestMapping("/users/{id}/get")
    @ResponseBody
    public Object ShowUserById(
            @PathVariable Long id,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) Integer age
    ) {
        return id + ": " + name + " " + age;
    }

    @RequestMapping("/users/{id}/remove")
    @ResponseBody
    public String params3(
            @PathVariable Long id,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) Integer age
    ) {
        return id + ": " + name + " " + age;
    }

    @RequestMapping("/user/{id}/add")
    @ResponseBody
    public String params4(
            @PathVariable Long id,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) Integer age
    ) {
        return id + ": " + name + " " + age;
    }

    @RequestMapping("api/users/{user-id}/tasks")
    @ResponseBody
    public Object getUserTasks(@PathVariable(name = "user-id") Long userId) {
        return "Zmienne: user-id=" + userId;
    }

    // http://localhost:8080/api/users/100/tasks/5
    //
    @RequestMapping("/api/users/{user-id}/tasks/{task-id}")
    @ResponseBody
    public Object getUserTask(
            @PathVariable(name = "user-id"                   ) Long    userId,
            @PathVariable(name = "task-id", required = false ) Integer taskId
    ) {
        return "Zmienne: user-id=" + userId + " task-id=" + taskId;
    }
}
