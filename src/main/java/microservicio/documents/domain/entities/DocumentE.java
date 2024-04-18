package microservicio.documents.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "documents")
public class DocumentE extends BaseE{

    private String id;
    private String body;
    private Set<StandardE> standards;

}
