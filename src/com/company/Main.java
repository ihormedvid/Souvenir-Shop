package com.company;

import java.io.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;


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

        String[] userDateSplited = userStringSplited[1].split("\\-");
        String userDateYear = userDateSplited[0];
        String userDateMounth = userDateSplited[1];
        String userDateDay = userDateSplited[2];

        int userPrice = Integer.parseInt(userStringSplited[2]);
        String userCurrency = userStringSplited[3];

        String userGoods = userStringSplited[4];

        PurchaceData data = new PurchaceData(userDateSplited,userPrice,userCurrency,userGoods);




        switch (userCommand) {
            case ("purchase"):

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


