import excepction.CustomizedExceptions;
import main.IndianStateCensusAnalyzer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class IndianStateCensusAnalyzerTest {
    IndianStateCensusAnalyzer id = new IndianStateCensusAnalyzer();
    /**
     * Test Case 1 : Given the States Census CSV file, Check to ensure the Number of Record matches
     *               This is a Happy Test Case where the records are checked.
     *
     * @throws CustomizedExceptions
     */
    @Test
    void givenTheStateCensusCSVFileEnsuresNumberOfRecordsMatches() throws CustomizedExceptions {
        String filePath = "C:\\Users\\Manish Kumar Singh\\IdeaProjects\\cencus analyzer\\src\\main\\java\\file";
        int result = id.getNumberOfRecords(filePath);
        Assertions.assertEquals(29,result);
    }
    /**
     * Test Case 2 : Given the State Census CSV File if incorrect Returns a custom Exception
     *               This is a Sad Test Case to verify if the exception is raised.
     */
    @Test
    void givenStateCensusCSVFileIfIncorrectReturnsCustomException() {
        //File Name is Incorrect
        String filePath = "C:\\Users\\Manish Kumar Singh\\IdeaProjects\\cencus analyzer\\src\\main\\java\\file";
        try {
            int result = id.getNumberOfRecords(filePath);
            Assertions.assertEquals(29,result);
        }
        catch (CustomizedExceptions exceptions) {
            exceptions.printStackTrace();
        }
    }
    /**
     * Test Case 3 : Given the State Census CSV File when correct but type incorrect Returns a custom Exception
     *               This is a Sad Test Case to verify if the type is incorrect then exception is raised.
     */
    @Test
    void givenStateCensusCSVFileWhenCorrectButTypeIncorrectReturnsCustomExceptions() {
        //File Type is different (.pdf)
        String filePath = "C:\\Users\\Manish Kumar Singh\\IdeaProjects\\cencus analyzer\\src\\main\\java\\file";
        try {
            int result = id.getNumberOfRecords(filePath);
            Assertions.assertEquals(29,result);

        }
        catch(CustomizedExceptions exceptions){
            exceptions.printStackTrace();
        }
    }
    /**
     * Test Case 4 : Given the State Census CSV File when correct but delimiter incorrect
     *               Returns a custom Exception
     *              This is a Sad Test Case to verify if the file
     *              delimiter is incorrect then exception is raised.
     */
    @Test
    void givenTheStateCensusCSVFileWhenCorrectButDelimeterIncorrectReturnsCustomizedExceptions() {
        String filePath = "C:\\Users\\Manish Kumar Singh\\IdeaProjects\\cencus analyzer\\src\\main\\java\\file";
        try {
            boolean result = id.delimiterChecker(filePath);
            Assertions.assertEquals(false,result);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * Test Case 5 : Given the State Census CSV File when correct but csv header incorrect
     *              Returns a custom Exception
     *              This is a Sad Test Case to verify if the header is
     *              incorrect then exception is raised.
     *
     */
    @Test
    void givenTheStateCensusCSVFileWhenCorrectButCSVHeaderIncorrectReturnsCustomException() {
        String filePath = "C:\\Users\\Manish Kumar Singh\\IdeaProjects\\cencus analyzer\\src\\main\\java\\file";
        try {
            boolean result = id.csvHeaderChecker(filePath);
            Assertions.assertEquals(false,result);
        }
        catch (IOException | CustomizedExceptions e) {
            e.printStackTrace();
        }
    }
}
