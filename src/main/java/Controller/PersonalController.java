package Controller;


import Entity.Personal;
import Services.PersonalServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personal")
public class PersonalController {

    @Autowired
    PersonalServices personalServices;

    @GetMapping
    public ResponseEntity<List<Personal>> getAll(){
        List<Personal> lista_personal = personalServices.getAll();
        if (lista_personal.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(lista_personal);
    }

    @GetMapping("/{id")
    public ResponseEntity<Personal> getById(@PathVariable("id") int id){
        Personal personal = personalServices.getPersonalById(id);
        if (personal==null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(personal);
    }

    @PostMapping
    public ResponseEntity<Personal> save(@RequestBody Personal personal){
        Personal nuevo_personal = personalServices.save(personal);
        return ResponseEntity.ok(personal);
    }



}
