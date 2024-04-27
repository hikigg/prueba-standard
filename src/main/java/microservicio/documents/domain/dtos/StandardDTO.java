package microservicio.documents.domain.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StandardDTO {

    @NotNull(message = "El phva no puede ser nulo")
    @NotBlank(message = "El phva no puede estar en blanco")
    @Size(min = 1, max = 50, message = "El phva debe tener entre 1 y 50 caracteres")
    private String phva;

    @NotNull(message = "El code no puede ser nulo")
    @NotBlank(message = "El code no puede estar en blanco")
    @NotEmpty(message = "El code no puede estar vacio")
    @Size(min = 1, max = 50, message = "El code debe tener entre 1 y 50 caracteres")
    private String code;


    // Si es necesario validar la colección items:
    @NotNull(message = "La colección de items no puede ser nula")
    @NotEmpty(message = "La colección de items no puede estar vacia")
    private Set<ItemDTO> items;


}
