package microservicio.documents.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemE {

    @Field(value = "item_id")
    private String itemId;

    private Set<SubItemE> subItems;

}
