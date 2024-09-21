package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation(){
        //given
        Instructor instructor = new Instructor(null, null);

        //when
       boolean isTeacher = instructor instanceof Teacher;

        //when
        Assert.assertTrue(isTeacher);
    }

    @Test
    public void testInheritance(){
        //given
        Instructor instructor = new Instructor(null, null);

        //when
        boolean isPerson = instructor instanceof Person;

        //when
        Assert.assertTrue(isPerson);

    }

    @Test
    public void testTeach(){
        //given
        Instructor instructor = new Instructor(null, null);
        Student student = new Student(null, null, 0.0);
        Double hoursToStudy = 5.0;
        Double preStudyTime = 0.0;
        Double expectedTotalStudyTime = hoursToStudy + preStudyTime;

        //when
        instructor.teach(student, hoursToStudy);
        boolean wasCorrectlyIncremented = student.getTotalStudyTime() == expectedTotalStudyTime;

        //when
        Assert.assertTrue(wasCorrectlyIncremented);
    }

    @Test
    public void testLecture(){
        //given
        Instructor instructor = new Instructor(null, null);

        //when

        //when

    }
}
