package pruebaInventario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pruebaInventario.entity.Cargo;
import pruebaInventario.service.CargoService;

import java.util.List;

@RestController
@RequestMapping(name = "/cargo")
public class CargoController {

    @Autowired
    CargoService cargoService;

    @GetMapping()
    private ResponseEntity<List<Cargo>> list(){
        List<Cargo> list = cargoService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
}
