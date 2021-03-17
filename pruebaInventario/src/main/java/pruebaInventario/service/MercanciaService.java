package pruebaInventario.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pruebaInventario.entity.Mercancia;
import pruebaInventario.repository.MercanciaRepository;

import java.util.List;

@Service
public class MercanciaService {

    @Autowired
    MercanciaRepository mercanciaRepository;

    public List<Mercancia> list(){
        return mercanciaRepository.findAll();
    }

    public Mercancia save(Mercancia mercancia){ mercanciaRepository.save(mercancia);return mercancia; }

    public void delete(int id){ mercanciaRepository.deleteById(id); }

}
