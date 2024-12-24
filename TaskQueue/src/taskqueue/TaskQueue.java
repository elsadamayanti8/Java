/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taskqueue;

/**
 *
 * @author LENOVO 13
 */
import java.util.LinkedList;
public class TaskQueue {

    private final LinkedList<String>tasks=new LinkedList<>();
    
    public void addTask(String task){
        tasks.addLast(task);//add task to end of the queue
        System.out.println("Task added:+task");
        
    }
    
    public String nextTask() {
        if(!tasks.isEmpty()){
            String task = tasks.pollFirst();//Remove and return the first task
            System.out.println("Processing task:+");
            return task;
        }else{
            System.out.println("Queue is empty.");
            return null;
            
            }
        }
        
        public void printQueue() {
           
            System.out.print("Current queue:");
            for(String task : tasks) {
                System.out.print(task+",");
                
            }
          
            System.out.println();
        }
        
        public static void main(String[]args){
            TaskQueue Queue  = new TaskQueue();
            
            Queue.addTask("Send email");
            Queue.addTask("Write report");
            Queue.addTask("Schedule meeting");
            Queue.printQueue();
            Queue.nextTask();
            Queue.nextTask();
            Queue.addTask("Prepare presentation");
            Queue.nextTask();
            Queue.printQueue();
            
        }
    
    }


