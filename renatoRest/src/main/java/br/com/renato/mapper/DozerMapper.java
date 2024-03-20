package br.com.renato.mapper;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;

//import com.github.dozermapper.core.DozerBeanMapperBuilder;
//import com.github.dozermapper.core.Mapper;

public class DozerMapper {

	// Instância do dozer;
//	private static Mapper mapper = DozerBeanMapperBuilder.buildDefault();

	
	
	private static ModelMapper mapper = new ModelMapper();

	
	// Método para converter apenas um objeto;
	public static <O, D> D parseObject(O origin, Class<D> destination) {

		return mapper.map(origin, destination);
	}

	
	// Método para converter uma lista de objetos;
	public static <O, D> List<D> parseListObject(List<O> origin, Class<D> destination) {

		List<D> destinationObjects = new ArrayList<D>();

		for (O o : origin) {
			destinationObjects.add(mapper.map(o, destination));
		}

		return destinationObjects;
	}
}
