package br.com.renato.mapper.custom;

import java.util.Date;

import org.springframework.stereotype.Service;

import br.com.renato.data.vo.v2.PersonVOV2;
import br.com.renato.model.Person;

@Service
public class PersonMapper {

	//Convertendo objeto da entidade para VO;
	public PersonVOV2 convertEntityToVo(Person person) {

		PersonVOV2 vo = new PersonVOV2();

		vo.setId(person.getId());
		vo.setAddress(person.getAddress());
		vo.setBirthDay(new Date());
		vo.setFirstName(person.getFirstName());
		vo.setLastName(person.getLastName());
		vo.setGender(person.getGender());

		return vo;
	}

	//Convertendo VO para objeto entidade;
	public Person convertVoToEntity(PersonVOV2 person) {

		Person entity = new Person();

		entity.setId(person.getId());
		entity.setAddress(person.getAddress());
		// vo.setBirthDay(new Date());
		entity.setFirstName(person.getFirstName());
		entity.setLastName(person.getLastName());
		entity.setGender(person.getGender());

		return entity;
	}

}
