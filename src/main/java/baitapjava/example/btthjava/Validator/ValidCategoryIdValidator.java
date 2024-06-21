package baitapjava.example.btthjava.Validator;
import baitapjava.example.btthjava.Validator.annotation.ValidCategoryId;
import baitapjava.example.btthjava.entity.Category;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidCategoryIdValidator implements ConstraintValidator<ValidCategoryId, Category> { @Override
public boolean isValid (Category category, ConstraintValidatorContext context) {
    return category != null && category.getId() != null;
}}
