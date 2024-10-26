package tw.demo.mybatisdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthoritiesService {

    @Autowired
    AuthoritiesMapper authoritiesMapper;

    public List<Authorities> getAllEntities() {
        return authoritiesMapper.getAll();
    }

}
