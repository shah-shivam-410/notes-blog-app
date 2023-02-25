package app.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import app.entites.Note;
import app.utility.RuntimeDataStorage;

@Controller
public class NotesController {

	RuntimeDataStorage str = new RuntimeDataStorage();

	@PostMapping("/addnote")
	public String addNote(HttpServletRequest req) {

		System.out.println("Inside add note servelet");

		Note n = new Note();
		n.setTitle(req.getParameter("title"));
		n.setDescription(req.getParameter("description"));

		System.out.println(n);
		str.upsertNote(n);

		return "redirect:notes";
	}

}
