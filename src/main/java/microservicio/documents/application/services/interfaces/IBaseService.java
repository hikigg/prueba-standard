package microservicio.documents.application.services.interfaces;

import java.util.List;
import java.util.Optional;

public interface IBaseService<T> {

    List<T> findAll();
    T findById(String id) throws Exception;
    T save(T t);
    void update(String id, T t) throws Exception;

    void delete(String id) throws Exception;

}
