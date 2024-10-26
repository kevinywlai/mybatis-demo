package tw.demo.mybatisdemo;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface AuthoritiesMapper {
    @Select("SELECT * FROM eazybank.authorities")
    List<Authorities> getAll();
}
