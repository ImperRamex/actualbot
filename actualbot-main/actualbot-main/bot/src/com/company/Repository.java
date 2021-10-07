package com.company;
import com.company.api.IGetAnecdote;
public class Repository {
    String defaultMessage1 = "Привет, я бот который знает 5 анекдотов, Введя число от 1 до 5 ты можешь его прочитать.";
    String defaultMessage2 = "Оцените по 10-ти балльной шкале.";
    String defaultMessage3 = "Давай попробуем еще раз.";
    String defaultMessage4 = "Извините, но это явно не число. Перезапустите программу и попробуйте снова!";
    public static String GetAnecdote(int number) {
        return switch (number) {
            case 1 -> "— Изя, ты помнишь, как у меня болели ноги в сорок первом?\n" +
                    "— Абраша, шо за вопросы! Конечно помню, ну и?\n" +
                    "— Ношу 43-й и не болят.";
            case 2 -> "Учительница диктует задачу:\n" +
                    "— 30 учеников съели 120 яблок, 150 слив и 60 абрикосов. Вовочка, ответь, что будет у каждого?\n" +
                    "— Расстройство желудка!";
            case 3 -> "Я работаю ветеринаром вот уже 30 лет! Надо же! 30 лет — коту под хвост!";
            case 4 -> "Во время сессии вызывают студента в деканат.\n" +
                    "— Какой экзамен не сдал?\n" +
                    "— Физику.\n" +
                    "Декан поднимается и спрашивает:\n" +
                    "— А хочешь автомат?\n" +
                    "Радостный студент отвечает:\n" +
                    "— Да!\n" +
                    "— Отчислен! — говорит декан.";
            case 5 -> "Две блондинки у машины:\n" +
                    "— Блин, колесо спустило!\n" +
                    "— Совсем?\n" +
                    "— Нет, только снизу.";
            default -> throw new IllegalArgumentException("Unexpected value:" + number);
        };
    }
    public static String AnswerFromBot(int number) {
        if (number < 4)
            return ("Извините, больше такого не смешного анекдота вы не увидите");
        if ((number >= 4) && (number <= 7))
            return ("Нейтрально...");
        else
            return ("Пойдет!!");
    }
    public static String GetDefaultMessage(int number) {
        return switch (number) {
            case 0 -> "Привет, я бот который знает 5 анекдотов, Введя число от 1 до 5 ты можешь его прочитать.";
            case 2 -> "Оцените по 10-ти балльной шкале.";
            case 3 -> "Давай попробуем еще раз.";
            default -> throw new IllegalArgumentException("Unexpected value:" + number);
        };
        }
}

