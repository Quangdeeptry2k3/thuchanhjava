package baitapjava.example.btthjava.Validator;
import baitapjava.example.btthjava.Validator.annotation.ValidUserId;
import baitapjava.example.btthjava.entity.User;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidUserIdValidator implements ConstraintValidator<ValidUserId, User> {

    @Override
    public boolean isValid(User user, ConstraintValidatorContext context) {
        if (user == null) {
            return true; // Valid if user is null
        }
        return user.getId() != null; // Valid if user's id is not null
    }
}
