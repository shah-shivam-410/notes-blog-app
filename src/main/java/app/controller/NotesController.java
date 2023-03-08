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
		Note n = new Note();
		n.setTitle(req.getParameter("title"));
		n.setDescription(req.getParameter("description"));
		str.upsertNote(n);
		return "redirect:notes";
	}

}
