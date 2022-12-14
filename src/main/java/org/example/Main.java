package org.example;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    static void displayHome() {
        println("===============================");
        println("HOME");
        println("1. View employee");
        println("2. Search employee");
        println("3. Update employee");
        println("4. Delete employee");
        println("5. Report employee");
        println("6. Exit");
        println("===============================");
    }

    static void viewEmployees(int amount, String [] name, String [] gender, int [] age, String [] hireDate, String [] job, double [] salary) {
        
            println("\n============================================================================================================================");
            println("|     Id     |     Name Employee     |     Gender     |     age     |     Hire Date     |     Job     |       Salary       |");
            println("============================================================================================================================");
    
                for (int j = 0; j < amount; j++) {
    
                    System.out.print("|     " + (j+1));
                    System.out.print("            " + name[j]);
                    System.out.print("                   " + gender[j]);
                    System.out.print("             " + age[j]);
                    System.out.print("            " + hireDate[j]);
                    System.out.print("        " + job[j]);
                    System.out.printf("       %,.2f     |",  salary[j]);
                    System.out.println();
    
                }
            println("============================================================================================================================");

    }

    static void createEmployee(int amount, String [] name, String [] gender, int [] age, String [] hireDate, String [] job, double [] salary) {
        
        for (int i = 0; i < amount; i++) {
            print("\nInsert name of employee : ");
            name[i] = scanner.next();
            print("\nInsert gender of employee : ");
            gender[i] = scanner.next();
            print("\nInsert age of employee : ");
            age[i] = scanner.nextInt();
            print("\nInsert hire date of employee : ");
            hireDate[i] = scanner.next();
            print("\nInsert job of employee : ");
            job[i] = scanner.next();
            print("\nInsert salary of employee : ");
            salary[i] = scanner.nextDouble();
        }

        println("CREATE EMPLOYEE SUCCESS\n");
    }

    static void updateEmployee(int searchId, String [] name, String [] gender, int [] age, String [] hireDate, String [] job, double [] salary) {

        String updateName, updateGender, updateHireDate, updateJob;
        int updateAge;
        double updateSalary;

        System.out.println("Id = " + searchId);
        print("\nUpdate name of employee : ");
        updateName = scanner.next();
        name[searchId-1] = updateName;
        print("\nUpdate gender of employee : ");
        updateGender = scanner.next();
        gender[searchId-1] = updateGender;
        print("\nUpdate age of employee : ");
        updateAge = scanner.nextInt();
        age[searchId-1] = updateAge;
        print("\nUpdate hire date of employee : ");
        updateHireDate = scanner.next();
        hireDate[searchId-1] = updateHireDate;
        print("\nUpdate job of employee : ");
        updateJob = scanner.next();
        job[searchId-1] = updateJob;
        print("\nUpdate salary of employee : ");
        updateSalary = scanner.nextDouble();
        salary[searchId-1] = updateSalary;

        println("UPDATE EMPLOYEE SUCCESS\n");
    }

    static String [] deleteName(int searchId, String [] name) {

        String [] newName = new String[name.length-1];

        for (int i = 0, k = 0; i < name.length; i++) {
            if (i == (searchId-1)) {
                continue;
            } else {
                newName[k++] = name[i];
            }
        }
        return newName;
   
    }

    static String [] deleteGender(int searchId, String[] gender) {

        String [] newGender = new String[gender.length-1];

        for (int i = 0, k = 0; i < gender.length; i++) {
            if (i == (searchId-1)) {
                continue;
            } else {
                newGender[k++] = gender[i];
            }
        }
        return newGender;

    }

    static int [] deleteAge(int searchId, int [] age) {

        int [] newAge = new int[age.length-1];

        for (int i = 0, k = 0; i < age.length; i++) {
            if (i == (searchId-1)) {
                continue;
            } else {
            newAge[k++] = age[i];
            }
        }
        return newAge;

    }

    static String [] deleteHireDate(int searchId, String [] hireDate) {

        String [] newHireDate = new String[hireDate.length-1];

        for (int i = 0, k = 0; i < hireDate.length; i++) {
            if (i == (searchId-1)) {
                continue;
            } else {
            newHireDate[k++] = hireDate[i];
            }
        }
        return newHireDate;

    }

    static String [] deleteJob(int searchId, String [] job) {

        String [] newJob = new String[job.length-1];

        for (int i = 0, k = 0; i < job.length; i++) {
            if (i == (searchId-1)) {
                continue;
            } else {
            newJob[k++] = job[i];
            }
        }
        return newJob;

    }

    static double [] deleteSalary(int searchId, double[] salary) {

        double [] newSalary = new double[salary.length-1];

        for (int i = 0, k = 0; i < salary.length; i++) {
            if (i == (searchId-1)) {
                continue;
            } else {
            newSalary[k++] = salary[i];
            }
        }
        return newSalary;

    }

    static void searchEmployee(int searchId, String [] name, String [] gender, int [] age, String [] hireDate, String [] job, double [] salary) {

            println("\n============================================================================================================================");
            println("|     Id     |     Name Employee     |     Gender     |     age     |     Hire Date     |     Job     |       Salary       |");
            println("============================================================================================================================");
    
            System.out.print("|     " + searchId);
            System.out.print("            " + name[searchId-1]);
            System.out.print("                   " + gender[searchId-1]);
            System.out.print("             " + age[searchId-1]);
            System.out.print("            " + hireDate[searchId-1]);
            System.out.print("        " + job[searchId-1]);
            System.out.printf("       %,.2f     |",  salary[searchId-1]);
            System.out.println();
    
            println("============================================================================================================================");

    }

    static void reportEmployee(int amount, String [] name, String [] gender, int [] age, String [] hireDate, String [] job, double [] salary) {

        viewEmployees(amount, name, gender, age, hireDate, job, salary);
        System.out.println();

        double total = 0, average = 0;
        int count = 0;

        for (int i = 0; i < amount; i++) {
            count++;
            total += salary[i];
        }

        average = total / count;

        println("==================================================================================================");
        println("|     Total Employee     |     Total Salary of Employee     |     Average Salary of Employee     |");
        println("==================================================================================================");
        System.out.printf("|     %,d", amount);
        System.out.printf("                        %,.2f", total);
        System.out.printf("                       %,.2f                   |\n", average);
        println("==================================================================================================");

    }
    
    static void print(String message) {
        System.out.print(message);
    }

    static void println(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        
        int amount, choice, searchId;
        String username, password, question;
        println("===============================");
        println("LOGIN STAFF RESTAURANT");
        println("===============================");
        while (true) {
            
            print("Username : ");
            username = scanner.next();
            print("Password : ");
            password = scanner.next();

            if (username.equals("admin") && password.equals("admin")) {
                    
                while (true) {

                    print("Insert amount of employee : ");
                    amount = scanner.nextInt();

                    if (amount < 1) {
                        println("Invalid number!");
                    } else if (amount >= 1) {
                        break;
                    }
                }
                
                String [] name = new String[amount];
                String [] gender = new String[amount];
                int [] age = new int[amount];
                String [] hireDate = new String[amount];
                String [] job = new String[amount];
                double [] salary = new double[amount];
                createEmployee(amount, name, gender, age, hireDate, job, salary);

                while (true) {
                    
                    displayHome();
                    print("Choice number 1 - 6 : ");
                    choice = scanner.nextInt();

                    switch (choice) {
                        case 1:
                            println("===============================");
                            println("DATA EMPLOYEE");
                            println("===============================");
                            viewEmployees(amount, name, gender, age, hireDate, job, salary);
                            break;
                        case 2:
                            println("===============================");
                            println("SEARCH EMPLOYEE");
                            println("===============================");
                            print("Insert id of employee : ");
                            searchId = scanner.nextInt();
                            searchEmployee(searchId, name, gender, age, hireDate, job, salary);
                            break;
                        case 3:
                            println("===============================");
                            println("UPDATE EMPLOYEE");
                            println("===============================");
                            print("Insert id of employee : ");
                            searchId = scanner.nextInt();
                            updateEmployee(searchId, name, gender, age, hireDate, job, salary);
                            break;
                        case 4:
                            println("===============================");
                            println("DELETE EMPLOYEE");
                            println("===============================");
                            print("Insert id of employee : ");
                            searchId = scanner.nextInt();
                            amount--;
                            name = deleteName(searchId, name);
                            gender = deleteGender(searchId, gender);
                            age = deleteAge(searchId, age);
                            hireDate = deleteHireDate(searchId, hireDate);
                            job = deleteJob(searchId, job);
                            salary = deleteSalary(searchId, salary);
                            
                            println("DELETE EMPLOYE SUCCESS\n");

                            break;
                        case 5:
                            println("===============================");
                            println("REPORT EMPLOYEE");
                            println("===============================");
                            reportEmployee(amount, name, gender, age, hireDate, job, salary);
                            break;
                        case 6:
                            System.exit(0);
                            break;
                        default:
                            println("Invalid input number!");
                            break;
                    }
                    print("Input again (y/n) ? ");
                    question = scanner.next();

                    if (!question.equalsIgnoreCase("y")) {
                        break;
                    }
                }

                } else {
                    println("Username or password are wrong!");
                }

            if (username.equals("admin") && password.equals("admin")) {
                break;
            }

        }

    }

}