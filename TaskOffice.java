package edu.dmacc.codedsm.hw17;

import java.util.List;

public class TaskOffice extends TaskPerfomer {
    @Override
    public void perfomTask(Task toDo, User user) {
        System.out.println(" i am in task office");

    }

    @Override
    public void performTask(Task toDo, List<User> users) {
        System.out.println(" i am in task office");
    }
}
