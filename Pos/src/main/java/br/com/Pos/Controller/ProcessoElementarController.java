package br.com.Pos.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProcessoElementarController {

//	@Autowired
//	private ProcessoElementar processo; 
	
	@RequestMapping("/testando")
	private String teste() {
		return "teste";
	}
}
