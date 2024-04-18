package microservicio.documents.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StandardE {

    @Field(value = "standard_id")
    private String standardId;

    private Set<ItemE> items;
}
