public class TaskManagementSystem {

    private Task head;
    public void addTask(int taskId, String taskName, String status) {
        Task newTask = new Task(taskId, taskName, status);
        if (head == null) {
            head = newTask;
            return;
        }
        Task temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newTask;
    }
    public void searchTask(int taskId) {
        Task temp = head;
        while (temp != null) {
            if (temp.taskId == taskId) {
                System.out.println("Task Found");
                System.out.println("Task ID : " + temp.taskId);
                System.out.println("Task Name : " + temp.taskName);
                System.out.println("Status : " + temp.status);
                return;
            }

            temp = temp.next;
        }

        System.out.println("Task Not Found");
    }

    // Traverse Tasks
    public void traverseTasks() {

        if (head == null) {
            System.out.println("No Tasks Available");
            return;
        }

        Task temp = head;

        while (temp != null) {

            System.out.println("Task ID : " + temp.taskId);
            System.out.println("Task Name : " + temp.taskName);
            System.out.println("Status : " + temp.status);
            System.out.println("-----------------------");

            temp = temp.next;
        }
    }

    // Delete Task
    public void deleteTask(int taskId) {

        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        if (head.taskId == taskId) {
            head = head.next;
            System.out.println("Task Deleted Successfully");
            return;
        }

        Task temp = head;

        while (temp.next != null &&
               temp.next.taskId != taskId) {

            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Task Not Found");
            return;
        }

        temp.next = temp.next.next;
        System.out.println("Task Deleted Successfully");
    }

    public static void main(String[] args) {

        TaskManagementSystem system =
                new TaskManagementSystem();

        system.addTask(1, "Design Module", "Pending");
        system.addTask(2, "Develop Module", "In Progress");
        system.addTask(3, "Testing", "Completed");

        System.out.println("\nTask List:");
        system.traverseTasks();

        System.out.println("\nSearching Task ID 2");
        system.searchTask(2);

        System.out.println("\nDeleting Task ID 1");
        system.deleteTask(1);

        System.out.println("\nUpdated Task List:");
        system.traverseTasks();
    }
}