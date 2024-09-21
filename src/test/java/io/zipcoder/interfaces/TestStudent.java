package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation(){
        //given
        Student student = new Student(null, null, 0.0);

        //when -
        boolean isLearner = student instanceof Learner;

        //then
        Assert.assertTrue(isLearner);
    }

    @Test
    public void testInheritance(){
        //given
        Student student = new Student(null, null, 0.0);

        //when -
        boolean isPerson = student instanceof Person;

        //then
        Assert.assertTrue(isPerson);
    }

    //purpose of this next test is to make sure the learn() method is
    //successfully incrementing the totalStudyTime, NOT setting it.

    @Test
    public void testLearn(){
        //given
        Student student = new Student(null, null, 0.0);
        Double preStudyTime = student.getTotalStudyTime();
        Double hoursToStudy = 5.0;
        Double expectedTotalStudyTime = preStudyTime + hoursToStudy;

        //when - learn() is being tested
        student.learn(hoursToStudy);
        Double actualTotalStudyTime = student.getTotalStudyTime();

        //then
        Assert.assertEquals(expectedTotalStudyTime, actualTotalStudyTime);
    }

}