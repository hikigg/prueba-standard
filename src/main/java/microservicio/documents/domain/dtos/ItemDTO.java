package microservicio.documents.domain.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import microservicio.documents.domain.entities.SubItemE;

import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemDTO {

    @NotNull(message = "Los subItems no pueden ser nulos")
    @NotEmpty(message = "Los subItems no pueden estar vacios")
    private Set<SubItemDTO> subItems = new HashSet<>();

    @NotNull(message = "El compliance no puede ser nulo")
    @NotBlank(message = "El compliance no puede estar en blanco")
    @NotEmpty(message = "El compliance no puede estar vacio")
    private String compliance;

    @NotNull(message = "El phva no puede ser nulo")
    @NotBlank(message = "El phva no puede estar en blanco")
    private String phva;




}
