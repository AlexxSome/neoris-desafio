package cl.neoris.desafio.repositories;

import cl.neoris.desafio.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);

}
