package ru.dataart.academy.java;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Calculator {
    /**
     * @param zipFilePath -  path to zip archive with text files
     * @param character   - character to find
     * @return - how many times character is in files
     */
    public Integer getNumberOfChar(String zipFilePath, char character) throws IOException {
        //Task implementation
        int counter=0;
        ZipInputStream zip=new ZipInputStream(new FileInputStream(zipFilePath));
        ZipEntry entry;
        while((entry=zip.getNextEntry())!=null){
            for(char c =(char)zip.read();c!=(char)-1;c =(char)zip.read()){
                if(c==character){
                    counter+=1;
                }
            }
            zip.closeEntry();
        }
        return counter;
    }

    /**
     * @param zipFilePath - path to zip archive with text files
     * @return - max length
     */

    public Integer getMaxWordLength(String zipFilePath) throws IOException {
        //Task implementation
        int counter,max=0;
        String s="";
        ZipInputStream zip=new ZipInputStream(new FileInputStream(zipFilePath));
        ZipEntry entry;
        while((entry=zip.getNextEntry())!=null){
            counter=0;
            for(char c = (char)zip.read(); c!=(char) -1; c = (char) zip.read()){
                if(c!= ' ' && c!= '\n'){
                    counter+=1;
                    s+=c;
                }
                else{
                    if(counter>max){
                        max=counter;
                    }
                    counter=0;
                }
            }
            zip.closeEntry();
        }
        return max;
    }

}
