package microservicio.documents.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class BaseE {

    private Status state;

    @Field(value = "create_at")
    private LocalDateTime createAt;

    @Field(value = "update_at")
    private LocalDateTime updateAt;


}
