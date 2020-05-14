package main;

import java.util.Scanner;

import java.util.regex.Matcher;

import java.util.regex.Pattern;

public class Main
{

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите приложение в котором будет поиск слов с трех букв:");

        String line = sc.nextLine();

        if(line.indexOf('.') == line.length() - 1 && line.length() > 1)
        {

            Pattern pattern = Pattern.compile("\\b[a-zA-zа-яА-ЯёЁ]{3}\\b");

            Matcher matcher = pattern.matcher(line);

            while (matcher.find())
            {

                System.out.println(matcher.group());

            }

        }

    }

}
