package akrem.demo.entity;


import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseEnitiy {
    @Id
    private Long id;
}
