package com.sof.loggyzer.stats;

import java.io.*;


public class FileParser {


    public static StringBuilder Pars(File file) {
        StringBuilder sb = new StringBuilder();
        try {
            InputStream in = new FileInputStream(file);
            InputStreamReader re = new InputStreamReader(in);
            BufferedReader reader = new BufferedReader(re);

            String ligne;
            while ((ligne = reader.readLine()) != null) {
                sb.append(ligne);

            }
        } catch (IOException e) {

            e.printStackTrace();
        }

        return sb;

    }
}