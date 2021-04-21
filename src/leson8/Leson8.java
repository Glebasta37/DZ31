package leson8;

import javax.sound.midi.Soundbank;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.sql.SQLOutput;

public class Leson8 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String r = reader.readLine();
        String t = reader.readLine();
        String а = reader.readLine();

        System.out.println(s + " будет получать " + Integer.parseInt(r) +" через " + Integer.parseInt(t) + " лет");
    }

}