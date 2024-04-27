/*
package microservicio.documents.application.services.implementations;

import microservicio.documents.application.repositories.DocumentRepository;
import microservicio.documents.application.services.interfaces.IDocumentService;
import microservicio.documents.domain.entities.DocumentE;
import microservicio.documents.domain.entities.Status;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class DocumentService implements IDocumentService {

    private final DocumentRepository documentRepository;

    public DocumentService(DocumentRepository documentRepository) {
        this.documentRepository = documentRepository;
    }

    private DocumentE findByDocument(String id) throws Exception {
        return documentRepository.findById(id).orElseThrow();
    }

    @Override
    public List<DocumentE> findAll() {
        return documentRepository.findAll();
    }

    @Override
    public DocumentE findById(String id) throws Exception {
        return findByDocument(id);
    }

    @Override
    public DocumentE save(DocumentE documentE) {
        documentE.setState(Status.Activo);
        documentE.setCreateAt(LocalDateTime.now());
        documentE.setUpdateAt(LocalDateTime.now());
        return documentRepository.save(documentE);
    }

    private String generateFileName(String originalFileName) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd.HH.mm.ss");
        String date = LocalDateTime.now().format(formatter);
        long numberRandom = Instant.now().toEpochMilli();
        String ext = StringUtils.getFilenameExtension(originalFileName);
        return "sig." + originalFileName + "." + date + "-" + numberRandom + ext;
    }

    private File convertFile(MultipartFile multipartFile) throws IOException {
        String fileName = generateFileName(multipartFile.getOriginalFilename());
        File file = new File(fileName);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(multipartFile.getBytes());
        fileOutputStream.close();

        Path uploadPath = Paths.get("ruta").toAbsolutePath().normalize();
        Files.createDirectories(uploadPath);

        // Guardar el archivo en la ruta de almacenamiento
        Path targetLocation = uploadPath.resolve(fileName);
//        Files.copy(file.getParent(), targetLocation, StandardCopyOption.REPLACE_EXISTING);



        return file;
    }

    @Override
    public void update(String id, DocumentE documentE) throws Exception {
        DocumentE documentDTO = findByDocument(id);
    }

    @Override
    public void delete(String id) throws Exception {
        DocumentE documentDTO = findByDocument(id);
    }
}
*/
