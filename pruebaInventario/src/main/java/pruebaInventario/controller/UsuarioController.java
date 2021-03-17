package pruebaInventario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pruebaInventario.entity.Usuario;
import pruebaInventario.service.UsuarioService;

import java.util.List;

@RestController
@RequestMapping(name = "/usuario")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    private ResponseEntity<List<Usuario>> list(){
        List<Usuario> list = usuarioService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
}
