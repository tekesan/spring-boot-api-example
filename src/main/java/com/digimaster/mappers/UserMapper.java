package com.digimaster.mappers;

import com.digimaster.dtos.UserMsDto;
import com.digimaster.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "Spring")
public interface UserMapper {
	
	UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
	
	//User To UserMsDto
	@Mappings({
	@Mapping(source= "email", target="emailaddress"),
	@Mapping(source = "role", target="rolename")
	})
	UserMsDto userToUserMsDto(User user);
	
	//List<User> to List<UserMsDto>
	List<UserMsDto> usersToUserDtos(List<User> users);

}
