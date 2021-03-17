package pruebaInventario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pruebaInventario.entity.Mercancia;

public interface MercanciaRepository extends JpaRepository<Mercancia, Integer> {
}
