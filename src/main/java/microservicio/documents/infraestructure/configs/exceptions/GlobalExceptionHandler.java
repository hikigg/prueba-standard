package microservicio.documents.infraestructure.configs.exceptions;

import microservicio.documents.domain.dtos.ApiResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiResponseDTO<Object>> exceptionHandler(Exception e) {
        return ResponseEntity.ok(
          new ApiResponseDTO<>(e.getMessage(), false, null)
        );
    }

}
