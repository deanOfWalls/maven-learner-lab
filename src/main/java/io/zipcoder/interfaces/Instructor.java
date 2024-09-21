package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher {

    public Instructor(Long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, Double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Learner[] learners, Double numberOfHours) {
        for (int i = 0; i < learners.length; i++) {
            learners[i].learn(numberOfHours/ learners.length);
        }
    }
}
