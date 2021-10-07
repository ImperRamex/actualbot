package com.company;

import com.company.api.IMessageReader;
import com.company.api.State;

import java.util.Scanner;

public class ConsoleMessageReader implements IMessageReader {
    @Override
    public String readMessage() {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();

        return message;
    }
}
