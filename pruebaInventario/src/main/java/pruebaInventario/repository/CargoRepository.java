package pruebaInventario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pruebaInventario.entity.Cargo;

public interface CargoRepository extends JpaRepository<Cargo, Integer> {
}
