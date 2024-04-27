package microservicio.documents.infraestructure.utils;

import microservicio.documents.domain.dtos.StandardDTO;
import microservicio.documents.domain.entities.StandardE;
import org.modelmapper.ModelMapper;

public class ModelMapperUtils {

    private static ModelMapper modelMapper;

    public static <S, T> T map(S source, Class<T> targetClass) {
        return modelMapper.map(source, targetClass);
    }

    public static <S, T> void mapVoid(S source, T targetClass) {
         modelMapper.map(source, targetClass);
    }


}
