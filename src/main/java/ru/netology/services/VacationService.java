package ru.netology.services;


public class VacationService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // калькулятор подсчета месяцев отдыха
        int money = 0; // сколько средств на счету
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                money = (money - expenses) / 3; // израсходовано на отпуск
                count++;
            } else {
                money = money + (income - expenses); //потречено без отпуска
            }
        }
        return count;
    }
}
