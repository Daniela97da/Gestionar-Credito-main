
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

@Configuration
public class MapPersonaFactory {

    @Bean
    public Function<Person, PersonDTO> entityToPersonDTO(ModelMapper mapper) {
        return persona -> mapper.map(persona, PersonDTO.class);
    }

    @Bean
    public Function<AddPersonDTO, Person> addDtoToPersonEntity(ModelMapper mapper) {
        return addPersonDTO -> mapper.map(addPersonDTO, Person.class);
    }

    @Bean
    public Function<EditPersonDTO, Person> EditDtoToPersonEntity(ModelMapper mapper) {
        return editPersonDTO -> mapper.map(editPersonDTO, Person.class);
    }
}
