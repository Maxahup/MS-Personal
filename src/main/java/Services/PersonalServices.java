package Services;

import Entity.Personal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;
import Repository.PersonalRepository;

import java.util.List;

public class PersonalServices {

    @Autowired
    PersonalRepository PersonalRepository;

    @Autowired
    RestTemplate restTemplate;

    public List<Personal> getAll(){
        return PersonalRepository.findAll();
    }

    public Personal getPersonalById(int id){
        return PersonalRepository.findById(id).orElse(null);
    }
    public Personal save(Personal personal){
        Personal nuevo_personal = PersonalRepository.save(personal);
        return nuevo_personal;
    }


}
