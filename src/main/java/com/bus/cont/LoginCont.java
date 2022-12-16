package com.bus.cont;

import com.bus.cont.general.Attr;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginCont extends Attr {

    @GetMapping("/login")
    String login(Model model) {
        AddAttributesLogin(model);
        return "login";
    }

}
