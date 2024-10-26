package tw.demo.mybatisdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("auth")
public class AuthoritiesController {

    @Autowired
    AuthoritiesService authoritiesService;

    @GetMapping("get")
    public ResponseEntity<List<Authorities>> getAuth() {

        return new ResponseEntity<>(authoritiesService.getAllEntities(), HttpStatus.OK);
    }
}
