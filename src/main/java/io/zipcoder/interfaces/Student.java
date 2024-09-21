package io.zipcoder.interfaces;

public class Student extends Person implements Learner {
    //we're not told what access modifier to use. what is the default? answer: the default is package-private, also known as default access
    double totalStudyTime;

    public Student(Long id, String name, Double totalStudyTime) {
        super(id, name);
        this.totalStudyTime = totalStudyTime;
    }

    @Override
    public void learn(Double numberOfHours) {
        this.totalStudyTime += numberOfHours;
    }


    @Override
    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}
