package pruebaInventario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pruebaInventario.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
