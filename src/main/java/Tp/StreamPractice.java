package Tp;

import java.util.*;
import java.util.stream.Collectors;

public class StreamPractice {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Abs", "aoc", "pqr", 12, "Male", 1345.5));
        employees.add(new Employee(1, "Ass", "aoc", "pqr", 14, "Female", 345.5));
        employees.add(new Employee(1, "Ars", "ac", "pr", 65, "Female", 345.5));
        employees.add(new Employee(1, "Aws", "aoc", "pqr", 15, "Male", 3345.5));
        employees.add(new Employee(1, "pbs", "ac", "pt", 12, "Female", 345.5));
        employees.add(new Employee(1, "qbs", "aoc", "pqr", 99, "Male", 5345.5));
        employees.add(new Employee(1, "ebs", "ac", "pr", 66, "Female", 345.5));

        // Print name of all the companies
        employees.stream().map(Employee::getCompany).distinct().forEach(System.out::println);

        //Avg age of male and female emp
        Map<String, Double> genderMap = employees.stream().collect(Collectors.groupingBy(Employee::getGender,
                Collectors.averagingInt(Employee::getAge)));
        genderMap.forEach((key, value) -> System.out.println("gender = " + key + " age= " + value));

        //Highest Paid emp in org
        Optional<Employee> maxSalEmp = employees.stream().max(Comparator.comparing(Employee::getSalary));
        System.out.println(maxSalEmp.get());

        //no of emp in each company
        Map<String, Long> resMap = employees.stream().collect(Collectors.groupingBy(Employee::getCompany, Collectors.counting()));
        resMap.forEach((k,v) -> System.out.println("comp = "+k+" count= "+v));

        //Avg sal by company
        Map<String, Double> collect = employees.stream().collect(Collectors.groupingBy(Employee::getCompany, Collectors.averagingDouble(Employee::getSalary)));
        collect.forEach((k,v) -> System.out.println("comp = "+k+" avg sal= "+v));

        // youngest male emp in pqr company
        Optional<Employee> min = employees.stream().filter(e -> "Male".equals(e.getGender()) && "pqr".equals(e.getCompany())).min(Comparator.comparing(Employee::getAge));
        System.out.println(min.get());


    }
}
