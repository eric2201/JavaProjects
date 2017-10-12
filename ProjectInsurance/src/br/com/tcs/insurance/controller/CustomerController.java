package br.com.tcs.insurance.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.tcs.insurance.dao.CustomerDao;
import br.com.tcs.insurance.model.Customer;

@Controller
public class CustomerController {
	
	@RequestMapping(method = RequestMethod.GET)
    public String goHome() {
        return "home";
    }

	@RequestMapping(value ="customer")
	public String form() {
		System.out.println("Executando a lógica com Spring MVC");

		return "customer/form";
	}

	@RequestMapping("addCustomer")
	public String addCustomer(Customer customer, Model model) {
		CustomerDao cd = new CustomerDao();
		if (customer.getName() != null) {

			boolean add = cd.addCustomer(customer);
			if (add == true) {
				model.addAttribute("msg", "Adicionado com sucesso!");
			} else {
				model.addAttribute("msg", "Erro ao adicionar!");
			}
		}
		return "customer/form";

	}
	@RequestMapping(value ="remove", method = RequestMethod.GET)
	public String removeCustomer() {
		

		return "customer/remove";
	}
	@RequestMapping(value ="removeCustomer", method= RequestMethod.GET)
	public ModelAndView removeCustomer(HttpServletRequest request, Model model) {
		CustomerDao cd = new CustomerDao();
		String id_string = request.getParameter("id");
		int id = Integer.parseInt(id_string);
		boolean remove = cd.removeCustomer(id);
		if (remove == true) {
			model.addAttribute("msg", "Removido com sucesso!");
		} else {
			model.addAttribute("msg", "Erro ao remover");
		}
		return new ModelAndView("customer/remove");
	}
	@RequestMapping(value ="update", method = RequestMethod.GET)
	public String update() {
		

		return "customer/update";
	}
	@RequestMapping(value="updateCustomer", method= RequestMethod.POST)
	public ModelAndView updateCustomer(Customer customer, Model model) {
		CustomerDao cd = new CustomerDao();
		
		int id = customer.getId();
		boolean update = cd.updateCustomer(id, customer);
		if (update == true) {
			model.addAttribute("msg", "Atualizado com sucesso!");
		} else {
			model.addAttribute("msg", "Erro ao atualizar");
		}
		return new ModelAndView("customer/update");
	}
	
	

}
