package org.academiadecodigo.urlsourceviewer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by codecadet on 30/10/17.
 */
public class SourceViewer {

    public static void main(String[] args) {


        try {
            URL url = new URL("http://www.academiadecodigo.org");

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));

            url.openConnection().getContent();

            String line = bufferedReader.readLine();

            while (line != null) {

                System.out.println(line);

                line = bufferedReader.readLine();
            }
        } catch (MalformedURLException e) {
            System.out.println("luig");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
