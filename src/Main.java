
public class Main {
    private static Employee[] listOfEmployees = new Employee[10];

    public static void printListOfEmployees () {
        for (int i = 0; i < listOfEmployees.length; i++) {
            if (i == listOfEmployees.length - 1) {
                System.out.println(listOfEmployees[i] + ".");
            } else
            System.out.println(listOfEmployees[i] + ";");
        }
    }
    public static int calculateSumOfSalaryPerMonth () {
        int [] salaries = new int [listOfEmployees.length];
        int sum = 0;
        for (int i = 0; i < salaries.length; i++) {
            salaries [i] = listOfEmployees[i].getSalary();
            sum = sum + salaries [i];
        }
        return sum;
    }


        public static String findEmployeeWithMinimumSalary () {
            int minSalary = listOfEmployees[0].getSalary();
            String name = null;
            for (final Employee current : listOfEmployees) {
                if (current.getSalary() < minSalary) {
                    minSalary = current.getSalary();
                }
            }
            for (int i = 0; i < listOfEmployees.length; i++) {
                if (listOfEmployees[i].getSalary() == minSalary) {
                    name = listOfEmployees[i].getEmployeesName();
                }
            } return name;
        }


    public static String findEmployeeWithMaximumSalary () {
        int maxSalary = listOfEmployees[0].getSalary();
        String name = null;
        for (final Employee current: listOfEmployees) {
            if (current.getSalary() > maxSalary) {
                maxSalary = current.getSalary();
            }
        }
        for (int i = 0; i < listOfEmployees.length; i++) {
            if (listOfEmployees[i].getSalary() == maxSalary) {
                name = listOfEmployees[i].getEmployeesName();
            }

        } return name;
    }
    public static void printNamesOfEmployees () {
        for (int i = 0; i < listOfEmployees.length; i++) {
            if (i == listOfEmployees.length - 1) {
                System.out.println(listOfEmployees[i].getEmployeesName() + ".");
            } else
            System.out.println(listOfEmployees[i].getEmployeesName() + ";");
        }
    }


    public static void increaseSalary (int percent) {
        for (int i = 0; i < listOfEmployees.length; i++) {
            listOfEmployees[i].setSalary(listOfEmployees[i].getSalary() * (100 + percent) / 100);

        }
    }

    public static String findEmployeeWithMinimalSalaryInDepartment (int department) {
        int numberOfEmployeesInDepartment = 0;
        for (int i = 0; i <listOfEmployees.length; i++) {
            if (listOfEmployees[i].getDepartmentName() == department) {
                ++numberOfEmployeesInDepartment;
            }
        }
        Employee [] employeesInDepartment = new Employee[numberOfEmployeesInDepartment];
        int counter = 0;
        for (int i = 0; i < listOfEmployees.length; i++) {
            if (listOfEmployees[i].getDepartmentName() == department) {
                employeesInDepartment [counter] = listOfEmployees[i];
                counter++;
            }
        }
        int minSalary = employeesInDepartment[0].getSalary();
        String name = null;
        for (final Employee current : employeesInDepartment)  {
                if (current.getSalary() < minSalary) {
                    minSalary = current.getSalary();
                }
            }
        for (int i = 0; i < employeesInDepartment.length; i++) {
            if (employeesInDepartment[i].getSalary() == minSalary) {
                name = employeesInDepartment[i].getEmployeesName();
                }
            }
        return name;
    }

    public static String findEmployeeWithMaximalSalaryInDepartment (int department) {
        int numberOfEmployeesInDepartment = 0;
        for (int i = 0; i <listOfEmployees.length; i++) {
            if (listOfEmployees[i].getDepartmentName() == department) {
                ++numberOfEmployeesInDepartment;
            }
        }
        Employee [] employeesInDepartment = new Employee[numberOfEmployeesInDepartment];
        int counter = 0;
        for (int i = 0; i < listOfEmployees.length; i++) {
            if (listOfEmployees[i].getDepartmentName() == department) {
                employeesInDepartment [counter] = listOfEmployees[i];
                counter++;
            }
        }
        int maxSalary = employeesInDepartment[0].getSalary();
        String name = null;
        for (final Employee current : employeesInDepartment)  {
            if (current.getSalary() > maxSalary) {
                maxSalary = current.getSalary();
            }
        }
        for (int i = 0; i < employeesInDepartment.length; i++) {
            if (employeesInDepartment[i].getSalary() == maxSalary) {
                name = employeesInDepartment[i].getEmployeesName();
            }
        }
        return name;
    }


    public static int calculateSumSalaryInDepartment (int department) {
        int sum = 0;
        for (int i = 0; i < listOfEmployees.length; i++) {
            if (listOfEmployees[i].getDepartmentName() == department) {
                sum = sum + listOfEmployees[i].getSalary();

            }
        } return sum;
    }
    public static double calculateAverageSalaryInDepartment (int department) {
        double averageSalary = 0;
        int numberOfEmployeesInDepartment = 0;
        for (int i = 0; i < listOfEmployees.length; i++) {
            if (listOfEmployees[i].getDepartmentName() == department) {
                numberOfEmployeesInDepartment++;
                averageSalary = calculateSumSalaryInDepartment(department)/ (double) numberOfEmployeesInDepartment;
            }

        }
        return averageSalary;
    }

    public static void increaseSalaryInDepartment (int department, int percent) {
        for (int i = 0; i < listOfEmployees.length; i++) {
            if (listOfEmployees[i].getDepartmentName() == department) {
                listOfEmployees[i].setSalary(listOfEmployees[i].getSalary() * (100 + percent) / 100);
            }
        }
    }

    public static void printNamesOfEmployeesInDepartment (int department) {
        for (int i = 0; i < listOfEmployees.length; i++) {
            if (listOfEmployees[i].getDepartmentName() == department) {
                System.out.println(listOfEmployees[i].getEmployeesName() + "; зарплата: " +
                        listOfEmployees[i].getSalary() + " руб.");
            }
        }
    }
    public static void printEmployeesWithSalaryLessThanNumber (int number) {
        System.out.println("Сотрудники с зарплатой меньше, чем " + number + " руб: ");
        for (int i = 0; i < listOfEmployees.length; i++) {
            if (listOfEmployees[i].getSalary() < number) {
                System.out.println("id: " + listOfEmployees[i].getId() + ". " + listOfEmployees[i].getEmployeesName() +
                        "; зарплата: " + listOfEmployees[i].getSalary() + " руб.");
            }
        }
    }

    public static void printEmployeesWithSalaryBiggerOrEqualThanNumber (int number) {
        System.out.println("Сотрудники с зарплатой больше или равной " + number + " руб: ");
        for (int i = 0; i < listOfEmployees.length; i++) {
            if (listOfEmployees[i].getSalary() >= number) {
                System.out.println("id: " + listOfEmployees[i].getId() + ". " + listOfEmployees[i].getEmployeesName() +
                        "; зарплата: " + listOfEmployees[i].getSalary() + " руб.");
            }
        }
    }

        public static void main (String[]args) {
            listOfEmployees[0] = new Employee("Иванов Иван Иванович", 1, 50000);
            listOfEmployees[1] = new Employee("Петров Петр Петрович", 1, 60000);
            listOfEmployees[2] = new Employee("Семенов Семен Семенович", 2, 70000);
            listOfEmployees[3] = new Employee("Александров Александр Александрович", 2, 80000);
            listOfEmployees[4] = new Employee("Ильин Илья Ильич", 3, 45000);
            listOfEmployees[5] = new Employee("Денисов Денис Денисович", 3, 90000);
            listOfEmployees[6] = new Employee("Сорокина Светлана Сергеевна", 4, 55000);
            listOfEmployees[7] = new Employee("Кукушкина Ксения Павловна", 4, 65000);
            listOfEmployees[8] = new Employee("Лебедева Ольга Иннокентьевна", 5, 75000);
            listOfEmployees[9] = new Employee("Журавлева Ирина Антоновна", 5, 85000);

            System.out.println("8. a)");
            printListOfEmployees();
            System.out.println("8. b) Сумма затрат на зарплаты в месяц: " + calculateSumOfSalaryPerMonth() + " руб.");
            System.out.println("8. c) ФИО сотрудника с минимальной зарплатой: " + findEmployeeWithMinimumSalary());
            System.out.println("8. d) ФИО сотрудника с максимальной зарплатой: " + findEmployeeWithMaximumSalary());
            System.out.println("8. e) Среднее значение зарплат: " + String.format("%.2f",
                    (calculateSumOfSalaryPerMonth()/(double)listOfEmployees.length)) + " руб.");
            System.out.println("8. f)");
            printNamesOfEmployees();
            System.out.println("проверка счетчика: " + listOfEmployees[listOfEmployees.length - 1].getId());
            System.out.println();

            increaseSalary(10);
            System.out.println("Список сотрудников после индексации зарплаты:");
            printListOfEmployees();
            System.out.println("2.a) Сотрудник с минимальной зарплатой в отделе 1: " + findEmployeeWithMinimalSalaryInDepartment(1));
            System.out.println("2.b) Сотрудник с максимальной зарплатой в отделе 2: " + findEmployeeWithMaximalSalaryInDepartment(2));
            System.out.println("2.c) Сумма затрат на зарплаты в месяц по отделу 3: " + calculateSumSalaryInDepartment(3) + " руб.");
            System.out.println("2.d) Средняя зарплата по отделу 4 равна " +
                    String.format("%.2f", calculateAverageSalaryInDepartment(4)) + " руб. в месяц");

            increaseSalaryInDepartment(5, 20);
            System.out.println("2.f) ");
            printNamesOfEmployeesInDepartment(5);
            System.out.println("3.a) ");
            printEmployeesWithSalaryLessThanNumber(71500);
            System.out.println("3.b) ");
            printEmployeesWithSalaryBiggerOrEqualThanNumber(71500);


        }
    }