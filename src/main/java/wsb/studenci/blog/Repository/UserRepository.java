package wsb.studenci.blog.Repository;

import org.springframework.data.repository.CrudRepository;
import wsb.studenci.blog.Entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}