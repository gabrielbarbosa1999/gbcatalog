package dev.gabrielbarbosa.gbcatalog.resource;

import dev.gabrielbarbosa.gbcatalog.entities.Categoria;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

    @GetMapping
    public ResponseEntity<List<Categoria>> findAll() {
        List<Categoria> list = new ArrayList<>();

        list.add(new Categoria(1L, "Livros"));
        list.add(new Categoria(2L, "Eletronicos"));

        return ResponseEntity.ok().body(list);
    }

}
