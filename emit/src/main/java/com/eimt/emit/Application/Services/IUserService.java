package com.eimt.emit.Application.Services;

import com.eimt.emit.Application.Dto.UserDto;
import com.eimt.emit.Application.Dto.newUserDto;
import com.eimt.emit.Application.Execptions.EmailExistsExecption;
import com.eimt.emit.Application.Execptions.NotExistingEmailExecption;
import com.eimt.emit.Domain.Models.User;

public interface IUserService {
    User registerNewUserAccount(newUserDto userDto) throws EmailExistsExecption;
    boolean confirmUser(String token);
    boolean emailExists(String email);
    boolean isUserConfirmed(String email);
    void ForgotPassword(String email) throws NotExistingEmailExecption;
    void ChangePassword(String email)throws NotExistingEmailExecption;
}
