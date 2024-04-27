package microservicio.documents.domain.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubItemDTO {

    @NotNull(message = "El subItemId no puede ser nulo")
    @NotBlank(message = "El subItemId no puede estar en blanco")
    @NotEmpty(message = "El subItemId no puede estar vacio")
    @Id
    private String subItemId;

    @NotNull(message = "El compliance no puede ser nulo")
    @NotBlank(message = "El compliance no puede estar en blanco")
    @NotEmpty(message = "El compliance no puede estar vacio")
    private String compliance;

    @NotNull(message = "El phva no puede ser nulo")
    @NotBlank(message = "El phva no puede estar en blanco")
    private String phva;

}
