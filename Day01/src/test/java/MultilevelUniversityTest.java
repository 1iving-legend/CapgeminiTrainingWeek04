
import multilevel_university.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MultilevelUniversityTest {

    ExamCourse examcourse;
    ResearchCourse researchcourse;
    AssignmentCourse assignmentCourse;

    @BeforeEach
    void setup(){
        examcourse= new ExamCourse("B-tech","Computer Science");
        researchcourse= new ResearchCourse("Nural-Network","Machine Learning");
        assignmentCourse= new AssignmentCourse("Crypto","Block-Chain");
    }


    @Test
    void assignedTest(){
        assertEquals("Computer Science",examcourse.getDepartment());
        assertEquals("Nural-Network",researchcourse.getCourseName());
        assertEquals("Block-Chain",assignmentCourse.getDepartment());
        if(true)
        {
            System.out.println("all test case passed");
        }
    }

    @Test
    void testGeniricClass() {
        Course<ExamCourse> course1 = new Course<>(examcourse);
        Course<ResearchCourse> course2 = new Course<>(researchcourse);
        Course<AssignmentCourse> course3 = new Course<>(assignmentCourse);

        assertNotNull(course1);
        assertNotNull(course2);
        assertNotNull(course3);
        if (true) {
            System.out.println("Geniric Class is working properly");
        }
    }

        @Test
        void testdisplay()
        {
            List<CourseType> allcourses = Arrays.asList(examcourse,assignmentCourse,researchcourse);

            assertDoesNotThrow(()->MultiLevelUniversity.displayAllCourses(allcourses));
        }

    }

