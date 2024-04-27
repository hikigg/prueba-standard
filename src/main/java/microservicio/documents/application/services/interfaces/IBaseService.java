package microservicio.documents.application.services.interfaces;

import java.util.List;
import java.util.Optional;

public interface IBaseService<T, R> {

    List<T> findAll();
    T findById(String id) throws Exception;
    T save(R r);
    void update(String id, R r) throws Exception;

    void delete(String id) throws Exception;

    void activate(String id) throws Exception;

}
