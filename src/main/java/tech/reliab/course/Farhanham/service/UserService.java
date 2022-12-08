package tech.reliab.course.farhanham.bank.service;

import tech.reliab.course.farhanham.bank.entity.Bank;
import tech.reliab.course.farhanham.bank.entity.User;

import java.time.LocalDate;


public interface UserService {
    User create(String firstName, String lastName, LocalDate birthDate, String job, Bank bank);
    User create(String firstName, String lastName, String patronymic, LocalDate birthDate, String job, Bank bank);
    User read();
    void update(User user);
    void delete(User user);
}