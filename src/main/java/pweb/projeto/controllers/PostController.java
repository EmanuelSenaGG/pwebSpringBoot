package pweb.projeto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pweb.projeto.dto.PostDTO;
import pweb.projeto.repository.IPostRepository;

@RestController
@RequestMapping("/posts")
public class PostController {

    @Autowired
    private IPostRepository repository;




    @GetMapping("/home")
    public String home(){
        return "Olaaaaaaaa";
    }

    @GetMapping()
    public List<PostDTO> listar(){

      return PostDTO.converte(repository.findAll());
    }

}
