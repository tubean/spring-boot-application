package io.github.tubean.myspringcrud.controller;

import io.github.tubean.myspringcrud.entity.User;
import io.github.tubean.myspringcrud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
public class UserController {
  @Autowired private UserService userService;

  @RequestMapping("/")
  public String index(Model model) {
    List<User> users = userService.getAllUser();

    model.addAttribute("users", users);

    return "index";
  }

  @RequestMapping(value = "add")
  public String addUser(Model model) {
    model.addAttribute("user", new User());
    return "addUser";
  }

  @RequestMapping(value = "/edit", method = RequestMethod.GET)
  public String editUser(@RequestParam("id") Long userId, Model model) {
    Optional<User> userEdit = userService.findUserById(userId);
    userEdit.ifPresent(user -> model.addAttribute("user", user));
    return "editUser";
  }

  @RequestMapping(value = "save", method = RequestMethod.POST)
  public String save(User user) {
    userService.saveUser(user);
    return "redirect:/";
  }

  @RequestMapping(value = "/delete", method = RequestMethod.GET)
  public String deleteUser(@RequestParam("id") Long userId, Model model) {
    userService.deleteUser(userId);
    return "redirect:/";
  }
}
