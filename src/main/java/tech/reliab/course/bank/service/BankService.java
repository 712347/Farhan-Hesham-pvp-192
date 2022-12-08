package tech.reliab.course.farhanham.bank.service;
import tech.reliab.course.farhanham.bank.entity.Bank;

public interface BankService {
    Bank create(String name);
    Bank read();
    void update(Bank bank);
    void delete(Bank bank);
}