import java.util.Arrays;

public class Main {

    public static void printListOfEmployees (Employee [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + ";");
        }
    }
    public static int calculateSumOfSalaryPerMonth (Employee[] employees) {
        int [] arr1 = new int [employees.length];
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr1 [i] = employees[i].getSalary();
            sum = sum + arr1 [i];
        }
        return sum;
    }
    //минимальное значение нашла одним способом (через foreach), максимальное - другим, с помощью сортировки массива.
    //Хотя оба значения можно было найти каким-либо одним из этих способов. Минус использования foreach - "магические
    // числа" при объявлении maxSalary и особенно minSalary
    public static int findMinimumSalary (Employee[] employees) {
        int minSalary = 2_000_000_000;
        for (final Employee current: employees) {
            if (current.getSalary() < minSalary) {
                minSalary = current.getSalary();
            }
        }
            return minSalary;
        }

        public static String findEmployeeWithMinimumSalary (Employee[] employees) {
        String name = "ФИО";
            for (int i = 0; i < employees.length; i++) {
                if (employees[i].getSalary() == findMinimumSalary(employees)) {
                    name = employees[i].getEmployeesName();
                }
            } return name;
        }
    public static int findMaximumSalary (Employee[] employees) {
        int maxSalary = -1;
        int [] arr3 = new int [employees.length];
        for (int i = 0; i < employees.length; i++) {
           arr3[i] = employees[i].getSalary();
           if (i == arr3.length - 1) {
               Arrays.sort(arr3);
               maxSalary = arr3[arr3.length - 1];
           }
        }
        return maxSalary;
    }
    public static String findEmployeeWithMaximumSalary (Employee[] employees) {
        String name = "ФИО";
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() == findMaximumSalary(employees)) {
                name = employees[i].getEmployeesName();
            }
        } return name;
    }
    public static void printNamesOfEmployees (Employee [] arr2) {
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i].getEmployeesName() + ";");
        }
    }



        public static void main (String[]args) {
            Employee[] listOfEmployees = new Employee[10];
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
            printListOfEmployees(listOfEmployees);

            System.out.println("b) Сумма затрат на зарплаты в месяц: " + calculateSumOfSalaryPerMonth(listOfEmployees) + " руб.");

            System.out.println("c) ФИО сотрудника с минимальной зарплатой: " + findEmployeeWithMinimumSalary(listOfEmployees));
            System.out.println("d) ФИО сотрудника с максимальной зарплатой: " + findEmployeeWithMaximumSalary(listOfEmployees));

            System.out.println("e) Среднее значение зарплат: " + String.format("%.2f",
                    (double)(calculateSumOfSalaryPerMonth(listOfEmployees)/ listOfEmployees.length)) + " руб.");
            System.out.println("f)");
            printNamesOfEmployees(listOfEmployees);

            //проверка счетчика
            System.out.println(listOfEmployees[listOfEmployees.length - 1].getId());





        }
    }