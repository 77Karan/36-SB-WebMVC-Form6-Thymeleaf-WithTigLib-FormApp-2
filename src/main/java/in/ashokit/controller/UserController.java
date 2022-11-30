package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.binding.User;

@Controller
public class UserController
{
	@GetMapping("/userform")
	public String loadForm(Model model)
	{
		User userObj = new User();
		model.addAttribute("user",userObj);
		return "index";
	}
	
	@PostMapping("/saveform")
	public String submitForm(User user,Model model)
	{
		model.addAttribute("msg","User Data saved Sucessfully");
		System.out.println(user);
		return "dashboard";
	}

}
