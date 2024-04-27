package microservicio.documents.infraestructure.controllers;

import microservicio.documents.application.services.interfaces.IStandardService;
import microservicio.documents.domain.dtos.ApiResponseDTO;
import microservicio.documents.domain.dtos.StandardDTO;
import microservicio.documents.domain.entities.StandardE;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class StandardController {


    private final IStandardService standardService;

    public StandardController(IStandardService standardService) {
        this.standardService = standardService;
    }


    @PostMapping("/standard")
    public ResponseEntity<ApiResponseDTO<StandardE>> save(@RequestBody StandardDTO standard) {
        return ResponseEntity.ok(
                new ApiResponseDTO<>("Guardado", true, standardService.save(standard))
        );
    }
}
