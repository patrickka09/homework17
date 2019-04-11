package edu.dmacc.codedsm.hw17;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

        User taskAssigner = new User("Patrick", "Karemera","5153320009");
        User taskAssignee = new User("Alain","Kabongo","007");
        Task task = new Task("Grocery",3,taskAssigner, taskAssignee);
        TaskPerson person = new TaskPerson();
        person.perfomTask(task,taskAssignee);
        TaskOffice office = new TaskOffice();
        office.perfomTask(task,taskAssignee);
        DelegationTaskTrainees trainees = new DelegationTaskTrainees();
        List<User> users = new ArrayList<>();
        trainees.performTask(task, users);

    }
}
