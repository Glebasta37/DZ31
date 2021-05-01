package SetinJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DZ7 {


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        for (int i =0; i >=0; i++ ) {
            String n =reader.readLine();
            if (n.equals("")) break;
                        list.add(Integer.parseInt(n));

        }


        for (int i =0; i <list.size(); i++ ) {
            String str = Integer.toString(list.get(i));
            System.out.println();
if (str.indexOf("-")>=0){
        System.out.print("-");
                        for (int j = str.length()-1; j >=1 ;j--){

            System.out.print(str.charAt(j));} }
else {
    for (int j = str.length()-1; j >=0 ;j--){

        System.out.print(str.charAt(j));} }
}






        }

        }






