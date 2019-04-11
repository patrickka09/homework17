package edu.dmacc.codedsm.hw17;

import java.util.List;

public class DelegationTaskTrainees extends TaskPerfomer {
    @Override
    public void performTask(Task toDo, List<User> users) {
        System.out.println( "i am in DelegationTaskTrainees");
    }
}
