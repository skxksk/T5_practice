package com.example.helloworld.app.echo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("echo")
public class EchoController {

	@ModelAttribute // (1)
    public EchoForm setUpEchoForm() {
        EchoForm form = new EchoForm();
        return form;
    }

	@RequestMapping // (2)
    public String index(Model model) {
        return "echo/index"; // (3)
    }

	@RequestMapping(value = "hello", method = RequestMethod.POST) // (4)
    public String hello(@Validated EchoForm form, BindingResult result, Model model) {// (5)
		if (result.hasErrors()) { // (2)
            return "echo/index";
        }
        model.addAttribute("name", form.getName()); // (6)
        return "echo/hello";
    }
}
