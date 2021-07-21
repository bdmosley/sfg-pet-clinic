package guru.springframework.sfgpetclinic.model;

import javax.persistence.Id;
import java.io.Serializable;

@Id
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

