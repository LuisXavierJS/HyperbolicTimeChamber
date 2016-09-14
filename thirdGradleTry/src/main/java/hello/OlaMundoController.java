package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OlaMundoController {
	@RequestMapping("/olaMundo")
	public String greeting(@RequestParam(value="nome",required=false,defaultValue="Mundo") String nome, Model model){
		model.addAttribute("nome",nome);
		return "olaMundo";
	}
}
