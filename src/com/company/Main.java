package com.company;

import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String userString = bufferedReader.readLine();

        if (userString.isEmpty()) {
            System.out.println("Стрічка пуста");
        }
        String[] userStringSplited = userString.split("\\s+");
        String userCommand = userStringSplited[0].toLowerCase();

        switch (userCommand) {
            case ("purchase"):
                //TODO
                break;
            case ("all"):
                //TODO
                break;
            case ("clear"):
                //TODO
                break;
            case ("report"):
                //TODO
                break;
            default:
                System.out.println("Command is not found");
                break;
        }

    }

}


