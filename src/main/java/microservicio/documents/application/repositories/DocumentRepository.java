package microservicio.documents.application.repositories;

import microservicio.documents.domain.entities.DocumentE;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableMongoRepositories
public interface DocumentRepository extends MongoRepository<DocumentE, String> {
}
