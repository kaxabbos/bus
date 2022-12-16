package com.bus.cont;

import com.bus.cont.general.Attr;
import com.bus.models.Users;
import com.bus.models.enums.Roles;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProfilesCont extends Attr {

    @GetMapping("/profiles")
    public String profiles(Model model) {
        AddAttributesProfiles(model);
        return "profiles";
    }

    @PostMapping("/user/{id}/update")
    public String userUpdate(Model model, @PathVariable Long id, @RequestParam String username, @RequestParam String password, @RequestParam String tel, @RequestParam String passport, @RequestParam Roles role) {
        AddAttributesProfiles(model);
        Users user = repoUsers.getById(id);
        user.setUsername(username);
        user.setPassword(password);
        user.setTel(tel);
        user.setPassport(passport);
        user.setRole(role);
        repoUsers.save(user);
        return "profiles";
    }


}
