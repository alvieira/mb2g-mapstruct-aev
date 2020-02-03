package guru.springframework.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import guru.springframework.domain.User;
import guru.springframework.model.UserCommand;

@Mapper
public interface UserMapper {
	UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

	UserCommand userToUserCommand(User user);

	User userCommandToUser(UserCommand userCommand);
}
