package pruebaInventario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import pruebaInventario.entity.Mercancia;
import pruebaInventario.service.MercanciaService;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(name = "/mercancia")
public class MercanciaController {

    @Autowired
    MercanciaService mercanciaService;

    private ResponseEntity<List<Mercancia>> list(){
        List<Mercancia> list = mercanciaService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @PostMapping
    private ResponseEntity<Mercancia> save(@RequestBody Mercancia mercancia){
        try {
            Mercancia mercanciaCreada = mercanciaService.save(mercancia);
            return ResponseEntity.created(new URI("/mercancia" + mercanciaCreada.getIdMercancia())).body(mercanciaCreada);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    private ResponseEntity<Mercancia> delete(@PathVariable ("id") int id){

         mercanciaService.delete(id);
         return new ResponseEntity(HttpStatus.OK);
    }

}
