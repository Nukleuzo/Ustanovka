package com.company;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        StringBuilder log = new StringBuilder();

        File dir = new File("C://Users//vasiliy.gudin//Games");
        File src = new File(dir, "src");
        File res = new File(dir, "res");
        File savegames = new File(dir, "savegames");
        File temp = new File(dir, "temp");
        File main = new File(src, "main");
        File test = new File(src, "test");
        File drawables = new File(res, "drawables");
        File vectors = new File(res, "vectors");
        File icons = new File(res, "icons");

        File TT = new File(temp, "temp.txt");
        File MJ = new File(main, "main.java");
        File UJ = new File(main, "utils.java");

        List<File> directoryNames = Arrays.asList(dir, src, res, savegames, temp, main, test, drawables, vectors, icons);
        for (File x : directoryNames) {
            if (x.mkdir()) {
                log.append("Создан каталог " + x.getName() + " \n");
            }
        }
        List<File> fileNames = Arrays.asList(TT, MJ, UJ);
        for (File file : fileNames) {
            try {
                if (file.createNewFile()) {
                    log.append("Создан каталог " + file.getName() + " \n");
                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }

        try (FileWriter tempTxtWriter = new FileWriter(TT)) {
            tempTxtWriter.write(log.toString());
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
