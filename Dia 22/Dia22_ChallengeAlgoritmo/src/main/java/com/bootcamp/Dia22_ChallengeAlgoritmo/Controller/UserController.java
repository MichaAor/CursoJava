package com.bootcamp.Dia22_ChallengeAlgoritmo.Controller;

import com.bootcamp.Dia22_ChallengeAlgoritmo.Controller.Service.UserService;
import com.bootcamp.Dia22_ChallengeAlgoritmo.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/users")
//@Api(value = "Controller Users")
public class UserController {
    @Autowired
    UserService us;

    @GetMapping
    public String getAllEstudiantes(Model model) {
        model.addAttribute("users", us.getAllUser());
        return "UserTemplates/UserIndex";
    }

    @GetMapping("/create")
    public String showFormUser(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "UserTemplates/UserCreate";
    }

    @PostMapping("/create")
    public String registerUser(@ModelAttribute("user") User user) {
        us.registerUser(user);
        return "redirect:/users";
    }


    @GetMapping("/update/{email}")
    public String modifyUser(@PathVariable("email") String email, Model model) {
        User user = us.getUserByEmail(email);
        model.addAttribute("user", user);
        return "UserTemplates/UserEdit";
    }
    @PostMapping("/update/{email}")
    public String modifyUser(@ModelAttribute("user") User user,
                                   @PathVariable("email") String email) {
        us.modifyUser(user, email);
        return "redirect:/users";
    }

    @GetMapping("/deleteInscripcion/{email}")
    public String deleteUser(@PathVariable("email") String email){
        us.deleteUser(email);
        return "redirect:/users";
    }


    @GetMapping("/find")
    public String getUserByEmail(@RequestParam("email") String email, Model model) {
        model.addAttribute("users",us.getUserByEmail(email));
        return "UserTemplates/UserIndex";
    }
}
