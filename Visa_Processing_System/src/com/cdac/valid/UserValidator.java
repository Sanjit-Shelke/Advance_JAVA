package com.cdac.valid;

import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.cdac.dto.User;

@Service
public class UserValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		
		return clazz.equals(User.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "emailId","eKey", "Please Enter registered EMAILid!");
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password","pass", "Please Enter Password");
		
		User user = (User) target;
		if(user.getEmailId() != null)
		{
			if(user.getPassword().length()<3)
			{
				errors.rejectValue("password", "pass", "Password should contain more than 5 character");
			}
		}
	}

}
