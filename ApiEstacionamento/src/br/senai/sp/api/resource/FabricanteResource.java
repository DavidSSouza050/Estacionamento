package br.senai.sp.api.resource;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.senai.sp.api.model.Fabricante;
import br.senai.sp.api.repository.FabricanteRepository;

@RestController
@RequestMapping("/fabricante")
public class FabricanteResource {
		
	@Autowired
	private FabricanteRepository fabricanteRepository;
	
	
	//PEGANDO TODOS OS FABRICANTES
	@GetMapping
	public List<Fabricante> getFabricantes(){
		return fabricanteRepository.findAll();
	}
	
	//PEGANDO FABRICANTE
	@GetMapping("/{id}")
	public Fabricante visualizarFabricante(@PathVariable Long id) {
		System.out.println("ID DO FABRICANTE: "+id);
		return fabricanteRepository.findById(id).get();
//		return null;
	}
	
	
	//CADASTRANDO UM FABRICANTE	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void cadastrarFabricante(@RequestBody Fabricante fabricante) {
		fabricanteRepository.save(fabricante);
	}
	
	//ATUALIZAR FABRICANTE
	@PutMapping("/{id}")
	public ResponseEntity<Fabricante> atualizarFabricante(
			@RequestBody Fabricante fabricante,
			@PathVariable Long id){
		
		Fabricante fabricanteAtuzalido = fabricanteRepository.findById(id).get();
		
		BeanUtils.copyProperties(fabricante, fabricanteAtuzalido, "id");
		
		fabricanteRepository.save(fabricante);
		
		return ResponseEntity.ok(fabricanteAtuzalido);
		
	}
	
	
	
	
	
	

	
	
	
}