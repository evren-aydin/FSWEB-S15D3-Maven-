package org.example;


import org.example.entity.Employee;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new LinkedList<>();
        employees.add(new Employee(1,"Evren","Aydın"));
        employees.add(new Employee(1,"Evren","Aydın"));
        employees.add(new Employee(2,"Kemal","Yurtsever"));
        employees.add(new Employee(3,"Engin","İnan"));
        employees.add(new Employee(4,"Meltem","Koca"));

        findDuplicates(employees);
        findUniques(employees);
        removeDuplicates(employees);
    }
    public static List<Employee> findDuplicates(List<Employee> employees){

        List<Employee> dublicateList = new LinkedList<>();

        for(Employee emp:employees){
           int a= Collections.frequency(employees,emp);
        if (a>1){
                dublicateList.add(emp);
        }
        }
        System.out.println("tekrar edenler listesi : "+dublicateList);
        return dublicateList;

    }

    public static Map<Integer,Employee> findUniques(List<Employee> employees){

        Map<Integer,Employee> stringMap= new HashMap<>();
        for(Employee emp:employees){
            int a= Collections.frequency(employees,emp);

            if (a>1){
                if(!stringMap.containsValue(emp)){
                    stringMap.put(emp.getId(),emp);
                }
            }
            if(a==1){
                stringMap.put(emp.getId(),emp);
            }
        }
        System.out.println("Tüm liste : "+stringMap);


        return stringMap;

    }
    public static List<Employee> removeDuplicates(List<Employee> employees){

        List<Employee> uniqueList = new LinkedList<>();
        Iterator empIterator = employees.iterator();

        while(empIterator.hasNext()){
            int a= Collections.frequency(employees,empIterator.next());
            if (a>1){
                empIterator.remove();
            }
        }
        uniqueList.addAll(employees);
        System.out.println("Unique liste : "+uniqueList);
        return uniqueList;

    }

}