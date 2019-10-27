import java.io.*;

import java.nio.charset.Charset;


import java.util.*;

public class Test {

    public static void main(String[] args) throws Exception {

        int min=0;
        int max=20;
        int count=20;

        newFile(0,20,20);

        readFile();
        

    }

    public static void newFile(int min, int max, int count) throws Exception{


        FileWriter fileForTest = new FileWriter("file1.txt");

        for(int i=0; i<count; i++ ) {
            Random randomizer = new Random();
            Integer number = randomizer.nextInt(max - min) + min;
            fileForTest.write(number.toString());
            fileForTest.write(",");
        }

        fileForTest.close();

    }


    public static void readFile() throws Exception{

        ArrayList<Integer> splitted = new ArrayList<>();

        String line="";
        FileInputStream fis = new FileInputStream("file1.txt");

        int i;

        while ((i=fis.read())!= -1) {
            line += (char)i;
        }

        for(int k=0; k<line.split("\\,").length; k++) {

            splitted.add(Integer.parseInt(line.split("\\,")[k]));
        }

        //System.out.println(splitted);

        Collections.sort(splitted);

        System.out.println(splitted);

        Collections.reverse(splitted);

        System.out.println(splitted);

    }

}
