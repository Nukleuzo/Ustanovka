package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        StringBuilder log = new StringBuilder(); //создаем пустой "собиратель" лога

        // Объявляем и создаем src, res, savegame, temp в Games

        File dir = new File("C://Users//vasiliy.gudin//IdeaProjects//Games");
        if (dir.mkdir()) System.out.println();  // TODO почему если убрать sout - не записывается в файл  ??
        log.append("Создана директория Games");
        log.append('\n');

        File src = new File(dir, "src");
        if (src.mkdir()) System.out.println();
        log.append("Создана директория src");
        log.append('\n');

        File res = new File(dir, "res");
        if (res.mkdir()) System.out.println("Создан каталог res");
        log.append("Создана директория res");
        log.append('\n');

        File savagame = new File(dir, "savegame");
        if (savagame.mkdir()) System.out.println("Создан каталог savegame");
        log.append("Создан каталог savegame");
        log.append('\n');

        File temp = new File(dir, "temp");
        if (temp.mkdir()) System.out.println("Создан каталог temp");
        log.append("Создан каталог temp");
        log.append('\n');

        // Объявляем и создаем main, test в scr

        File main = new File(src, "main");
        if (main.mkdir()) System.out.println("Создан каталог main");
        log.append("Создан каталог main");
        log.append('\n');

        File test = new File(src, "test");
        if (test.mkdir()) System.out.println("Создан каталог test");
        log.append("Создан каталог test");
        log.append('\n');

        // Объявляем и создаем файлы Main.java, Utils.java в main

        File MJ = new File(main, "Main.java");
        try {
            if (MJ.createNewFile()) System.out.println("Создан файл Main.java");
            log.append("Создан файл Main.java");
            log.append('\n');
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        File UJ = new File(main, "Utils.java");
        try {
            if (UJ.createNewFile()) System.out.println("Создан файл Utils.java");
            log.append("Создан файл Utils.java");
            log.append('\n');
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        // Объявляем и создаем каталоги drawables, vectors, icons в res

        File drawables = new File(res, "drawables");
        if (drawables.mkdir()) System.out.println("Создан каталог drawables");
        log.append("Создан каталог drawables");
        log.append('\n');

        File vectors = new File(res, "vectors");
        if (vectors.mkdir()) System.out.println("Создан каталог vectors");
        log.append("Создан каталог vectors");
        log.append('\n');

        File icons = new File(res, "icons");
        if (icons.mkdir()) System.out.println("Создан каталог icons");
        log.append("Создан каталог icons");
        log.append('\n');


        // Объявляем и создаем файл temp.txt в temp
        File TT = new File(temp, "temp.txt");
        try {
            if (TT.createNewFile()) System.out.println("Создан файл temp.txt");
            log.append("Создан файл temp.txt");
            log.append('\n');

            try (FileWriter writer = new FileWriter(TT, false)) {              // Записываем log в temp.txt в temp
                writer.write(String.valueOf(log));
                writer.flush();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

