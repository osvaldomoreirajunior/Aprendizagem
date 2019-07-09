package com.example.finan.as;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/movimentacao")
public class MovimentacaoController {

	
	@Autowired
	private MovimentacaoDAO movimentacaoDao;
	
	@GetMapping
	public ModelAndView listar() {
		List<Movimentacao> lista = movimentacaoDao.findAll();
		
		ModelAndView modelAndView = new ModelAndView("movimentacao");
		modelAndView.addObject("movimentacao", lista);

		return modelAndView;
	}
	
	
	@RequestMapping(method = RequestMethod.POST)
	public String adicionarConta(HttpServletRequest request, @RequestParam("titulo") String titulo, @RequestParam("valor") Double valor, @RequestParam("despesa") Boolean despesa ) {
		Movimentacao objMovimentacao = new Movimentacao();
		objMovimentacao.setTitulo(titulo);
		objMovimentacao.setValor(valor);
		objMovimentacao.setDespesa(despesa);
		
		if(despesa == true) {
			objMovimentacao.setTotalfinancas(valor);
		} else {
			objMovimentacao.setTotalfinancas(valor - objMovimentacao.getTotalfinancas());
		}
		
		
		Movimentacao novoMovimentacao = movimentacaoDao.save(objMovimentacao);
		return "redirect:" + request.getRequestURI() + "/" + novoMovimentacao.getId();
	}
	
	

	
	
}
