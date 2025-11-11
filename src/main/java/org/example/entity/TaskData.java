package org.example.entity;

import java.util.HashSet;
import java.util.Set;

public class TaskData {
    private Set<Task> annsTasks;
    private Set<Task> bobsTasks;
   private Set<Task> carolsTasks;
    private Set<Task> unassignedTasks;

    public TaskData(Set<Task> bobsTasks, Set<Task> annsTasks, Set<Task> carolsTasks, Set<Task> unassignedTasks) {
        this.bobsTasks = bobsTasks;
        this.annsTasks = annsTasks;
        this.carolsTasks = carolsTasks;
        this.unassignedTasks = unassignedTasks;
    }
    public Set<Task> getTasks(String name) {

        if (name.equals("ann")) {
            return annsTasks;
        } else if (name.equals("bob")) {
            return bobsTasks;
        } else if (name.equals("carol")) {
            return carolsTasks;
        } else if (name.equals("all")) {
            Set<Task> allTasks = new HashSet<>();
            allTasks.addAll(annsTasks);
            allTasks.addAll(bobsTasks);
            allTasks.addAll(carolsTasks);
            return allTasks;
        }

        return new HashSet<>();
    }

    public Set<Task> getUnion(Set<Task>... sets) {
        Set<Task> union = new HashSet<>();
        for (Set<Task> s : sets) {
            union.addAll(s);
        }
        return union;
    }

    public Set<Task> getIntersection(Set<Task> set1, Set<Task> set2) {
       Set<Task> set1Copy = new HashSet<>(set1);
        return set1Copy;
    }

    public Set<Task> getDifferences(Set<Task> set1, Set<Task> set2) {
        set1.removeAll(set2);
        return set1;
    }

 }
