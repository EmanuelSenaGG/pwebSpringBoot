package pweb.projeto.dto;

import java.util.List;
import java.util.stream.Collectors;

import pweb.projeto.models.Categoria;
import pweb.projeto.models.Post;

public class PostDTO {
    private Long id;
    private String titulo;
    private String texto;
    private String usuario;
    private Categoria categoria;

    public PostDTO(Post post) {
    this.id = post.getId();
    this.titulo = post.getTitulo();
    this.texto = post.getTexto();
    this.usuario = post.getUsuario().getNome();
    this.categoria = post.getCategoria();
    }

    public static  List<PostDTO> converte(List<Post> lista) {
        return lista.stream().map(PostDTO::new).collect(Collectors.toList());
    }

}
