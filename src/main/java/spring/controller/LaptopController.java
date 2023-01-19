package spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import spring.entities.Laptop;
import spring.service.LaptopService;

@Controller
public class LaptopController {

	@Autowired
	private LaptopService service;

	@RequestMapping("/")
	public String homePage() {
		System.out.println("add laptop form");
		return "addLaptop";
	}

	@RequestMapping("/handledata")
	public String addPage(@ModelAttribute Laptop laptop, Model model) {

		System.out.println("handle form");
		service.addLaptop(laptop);
		System.out.println("saved data");
		return "redirect:/fetch";
	}

	@RequestMapping("/fetch")
	public String getPage(Model model) {
		List<Laptop> laptops = service.getAllLaptops();
		model.addAttribute("laps", laptops);
		return "View";
	}

	@RequestMapping("delete/{id}")
	public String delete(@PathVariable("id") int id) {
		service.deleteLaptop(id);
		return "redirect:/fetch";
	}

	@RequestMapping("update/{id}")
	public String update(@PathVariable("id") int id, Model model) {
		Laptop laptop = service.getLaptop(id);
		model.addAttribute("laptop", laptop);
		return "edit";
	}

	@RequestMapping(path = "update/{id}/editedform" ,method = RequestMethod.POST)
	public String saveUpdate(@ModelAttribute Laptop laptop) {
		service.updateLaptop(laptop);
		return "redirect:/fetch";
	}
}
