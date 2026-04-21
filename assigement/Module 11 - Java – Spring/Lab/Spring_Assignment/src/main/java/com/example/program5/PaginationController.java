package com.example.program5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import jakarta.annotation.PostConstruct;

@Controller
public class PaginationController {
    @Autowired
    private CustomerRepository repository;

    @PostConstruct
    public void initData() {
        for(int i=1; i<=25; i++) {
            repository.save(new Customer("Customer " + i));
        }
    }

    @GetMapping("/paged")
    public String getPaged(@RequestParam(defaultValue = "0") int page, Model model) {
        Page<Customer> customerPage = repository.findAll(PageRequest.of(page, 5));
        model.addAttribute("customerPage", customerPage);
        return "program5/paged";
    }
}
