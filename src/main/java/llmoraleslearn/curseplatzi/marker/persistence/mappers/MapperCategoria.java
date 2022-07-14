package llmoraleslearn.curseplatzi.marker.persistence.mappers;

import llmoraleslearn.curseplatzi.marker.domain.Categoria;
import llmoraleslearn.curseplatzi.marker.persistence.entities.Category;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface MapperCategoria {

    @Mapping(source = "idCategory", target = "categoriasId")
    @Mapping(source = "description", target = "categoria")
    @Mapping(source = "state", target = "activo")
    Categoria toCategoria(Category category);

    @InheritInverseConfiguration
    @Mapping(target = "productList", ignore = true)
    Category toCategory(Categoria categoria);

}
