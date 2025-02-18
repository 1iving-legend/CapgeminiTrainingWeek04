import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
 import static org.junit.jupiter.api.Assertions.*;
import ai_resume_screening.*;

public class AIResumeScreeningTest {


    SoftwareEngineer engineer;
    ProductManager manager;
    DataScientist analyst;

    @BeforeEach
    void init(){
        engineer= new SoftwareEngineer("Bhavya Dattey",10);
        manager= new ProductManager("Riya Yadav",8);
        analyst= new DataScientist("Tarun Dubey",7);
    }

    @Test
    void valueAssismentTest()
    {
        assertEquals(10,engineer.getExperienceYears());
        if(true)
        {
            System.out.println(engineer.getCandidateName());
        }
        assertEquals("Riya Yadav",manager.getCandidateName());
        if(true)
            System.out.println(manager.getExperienceYears());
        assertEquals(7,analyst.getExperienceYears());
        if(true)
        {
            System.out.println(analyst.getCandidateName());
        }

    }

    @Test
    void geniricClassTest()
    {
           Resume<DataScientist> analyst1= new Resume<>(analyst);
           Resume<ProductManager> manager1=new Resume<>(manager);
           Resume<SoftwareEngineer> engineer1= new Resume<>(engineer);

           assertNotNull(engineer1);
        assertNotNull(manager1);
        assertNotNull(analyst1);
        if(true)
        {
            System.out.println("all test cases passed");
        }

    }





}
