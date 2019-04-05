package com.eimt.emit.infrastructure;

import com.eimt.emit.Application.Dto.UserDto;
import com.eimt.emit.Application.Dto.newUserDto;
import com.eimt.emit.Application.Execptions.EmailExistsExecption;
import com.eimt.emit.Application.Execptions.NotExistingEmailExecption;
import com.eimt.emit.Application.Services.IUserService;
import com.eimt.emit.Domain.Models.User;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    @Override
    public User registerNewUserAccount(newUserDto userDto) throws EmailExistsExecption {
        User user = new User(userDto.Id,userDto.);

    }

    @Override
    public boolean confirmUser(String token) {
        return false;
    }

    @Override
    public boolean emailExists(String email) {
        return false;
    }

    @Override
    public boolean isUserConfirmed(String email) {
        return false;
    }

    @Override
    public void ForgotPassword(String email) throws NotExistingEmailExecption {
        
    }

    @Override
    public void ChangePassword(String email) throws NotExistingEmailExecption {

    }

    @Override
    public void SendNewPassword(String email) throws NotExistingEmailExecption {

    }

    @Override
    public void SignIn(UserDto userDto) {

    }
}
