package ProjectDio.PersonAPI.dto.mapper;

import ProjectDio.PersonAPI.dto.request.PersonDTO;
import ProjectDio.PersonAPI.entity.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public interface PersonMapper {

    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    Person toModel(PersonDTO dto);

    PersonDTO toDTO(Person dto);
}