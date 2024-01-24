package com.example.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.entity.Book;
import com.example.repository.BookRepository;

@Controller
public class BookController {

	@Autowired
	private BookRepository repo;
	
	@GetMapping("/getBook")
	public String getBookId(@RequestParam("id") Integer id,Model model) {
		System.out.println("Id:: "+id);
		Optional<Book> bookObj=repo.findById(id);
		//ModelAndView mav=new ModelAndView();
		if(bookObj.isPresent()) {
			System.out.println(bookObj);
			//mav.addObject("book", bookObj.get());
			model.addAttribute("book", bookObj.get());
		}
		//mav.setViewName("index");
		//return mav;
		return "index";
	}
	
	
	
}
