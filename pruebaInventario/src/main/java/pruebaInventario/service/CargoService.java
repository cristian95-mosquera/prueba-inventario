package pruebaInventario.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pruebaInventario.entity.Cargo;
import pruebaInventario.repository.CargoRepository;

import java.util.List;

@Service
public class CargoService {

    @Autowired
    CargoRepository cargoRepository;

    public List<Cargo> list(){
        return cargoRepository.findAll();
    }
}
