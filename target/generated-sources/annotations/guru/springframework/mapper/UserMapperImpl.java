package guru.springframework.mapper;

import guru.springframework.domain.User;
import guru.springframework.model.UserCommand;

/*
@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-02-03T00:02:01-0300",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 11.0.5 (Private Build)"
)
*/
public class UserMapperImpl implements UserMapper {

    @Override
    public UserCommand userToUserCommand(User user) {
        if ( user == null ) {
            return null;
        }

        UserCommand userCommand = new UserCommand();

        userCommand.setFirstName( user.getFirstName() );
        userCommand.setLastName( user.getLastName() );
        userCommand.setEmail( user.getEmail() );

        return userCommand;
    }

    @Override
    public User userCommandToUser(UserCommand userCommand) {
        if ( userCommand == null ) {
            return null;
        }

        User user = new User();

        user.setFirstName( userCommand.getFirstName() );
        user.setLastName( userCommand.getLastName() );
        user.setEmail( userCommand.getEmail() );

        return user;
    }
}
