package tech.reliab.course.farhanham.bank.service;

import tech.reliab.course.farhanham.bank.entity.Bank;
import tech.reliab.course.farhanham.bank.entity.BankOffice;

public interface BankOfficeService {
    BankOffice create(String name, Bank bank, String address, double rent);
    BankOffice read();
    void update(BankOffice bankOffice);
    void delete(BankOffice bankOffice);
}