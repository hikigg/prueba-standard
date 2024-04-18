package microservicio.documents.domain.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponseDTO<T> {


    private static final String DATA_FOUND = "Data found successfully";


    private String message;
    private boolean state;
    private T data;
}
