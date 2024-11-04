package pweb.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pweb.projeto.models.Post;


public interface IPostRepository extends JpaRepository<Post,Long> {

}
