package CoreJavaTest.v2ch01.textFile;

import CoreJavaTest.v1ch04.EmployeeTest.Employee;
import sun.util.resources.CalendarData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * Created by mizeshuang on 2016/7/20.
 */
public class TextFileTest {

    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("123", 2000, 2016, 5, 12);
        employees[1] = new Employee("456", 3000, 2016, 6, 13);
        employees[2] = new Employee("789", 4000, 2016, 7, 14);
        try {
            PrintWriter out = new PrintWriter("source/employee.dat", "UTF-8");
            new TextFileTest().writeData(employees, out);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        Scanner scanner = null;
        try {
            scanner = new Scanner(new FileInputStream("source/employee.dat"), "UTF-8");
            Employee[] employees1 = new TextFileTest().readData(scanner);
            for (Employee employee : employees1) {
                System.out.println(employee.getName());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    public void writeData(Employee[] employees, PrintWriter out) {
        out.println(employees.length);
        for (Employee employee : employees) {
            writeEmployee(employee, out);
        }
    }

    public void writeEmployee(Employee employee, PrintWriter out) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(employee.getHireDay());
        out.println(employee.getName() + "|" + employee.getSalary() + "|" + gregorianCalendar.get(Calendar.YEAR) + "|" + gregorianCalendar.get(Calendar.MONTH) + 1 + "|" + gregorianCalendar.get(Calendar.DAY_OF_MONTH));
        out.flush();
    }

    public Employee[] readData(Scanner in) {
        int n = in.nextInt();
        in.nextLine();
        Employee[] employees = new Employee[n];
        for (int i = 0; i < n; i++) {
            employees[i] = readEmployee(in);
        }
        return employees;
    }

    public Employee readEmployee(Scanner in) {
        String line = in.nextLine();
        String[] strings = line.split("\\|");
        String name = strings[0];
        double salary = Double.parseDouble(strings[1]);
        int year = Integer.parseInt(strings[2]);
        int month = Integer.parseInt(strings[3]);
        int day = Integer.parseInt(strings[4]);
        return new Employee(name, salary, year, month, day);
    }

}
