package main;

import excepction.CustomizedExceptions;
import fileoperations.FileReaderWriter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class IndianStateCensusAnalyzer {

    public static void main(String[] args) throws CustomizedExceptions {
        String filePath = "C:\\Users\\Manish Kumar Singh\\IdeaProjects\\cencus analyzer\\src\\main\\java\\file";
        IndianStateCensusAnalyzer id = new IndianStateCensusAnalyzer();

    }
    /**
     * Purpose : To get the number of records in CSV File
     *
     * @param filePath path of File
     * @return
     * @throws CustomizedExceptions
     */
    public int getNumberOfRecords(String filePath) throws CustomizedExceptions {
        FileReaderWriter fileReaderWriter = new FileReaderWriter();
        int count = fileReaderWriter.getTotalRecords(filePath);

        return count;
    }
    /**
     * Purpose : To get flag  value from FileReader method
     *
     * @param filePath
     * @return
     */
    public boolean delimiterChecker(String filePath) {
        FileReaderWriter fileReaderWriter = new FileReaderWriter();
        boolean flag = fileReaderWriter.checkDelimiter(filePath);
        return flag;
    }
    /**
     * Purpose : To get flag value from FileReaderWriter Method
     *
     * @param filePath
     * @return
     * @throws IOException
     * @throws CustomizedExceptions
     */
    public  boolean csvHeaderChecker(String filePath) throws IOException, CustomizedExceptions {
        FileReaderWriter fileReaderWriter = new FileReaderWriter();
        ArrayList<String> stringArrayList = new ArrayList<>(Arrays.asList("State","Population","Area","Density"));
        boolean flag = fileReaderWriter.checkCSVHeader(filePath, stringArrayList);
        return flag;

    }

}
