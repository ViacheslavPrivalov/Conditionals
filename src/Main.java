public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача1");
        int age = 19;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, " +
                    "нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println("Задача2");
        int temp = 4;
        if (temp < 5) {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки");
        }
    }

    public static void task3() {
        System.out.println("Задача3");
        int speed = 50;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
    }

    public static void task4() {
        System.out.println("Задача4");
        int age = 1;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        } else if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        } else if (age > 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        } else if (age >= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то никуда ходить не нужно");
        }
    }

    public static void task5() {
        System.out.println("Задача5");
        int childAge = 4;
        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционе");
        } else if (childAge >= 5 && childAge < 14) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
    }

    public static void task6() {
        System.out.println("Задача6");
        int totalPlaces = 102;
        int sitPlaces = 60;
        int countPlaces = 102;
        if (countPlaces <= sitPlaces) {
            System.out.println("Есть сидячее место");
        } else if (countPlaces > sitPlaces && countPlaces < totalPlaces) {
            System.out.println("Есть стоячее место");
        } else {
            System.out.println("Мест нет");
        }
    }

    public static void task7() {
        System.out.println("Задача7");
        int one = 1;
        int two = 2;
        int three = 3;

        if (one > two) {
            if (one >= three) {
                System.out.println("The biggest number is: " + one);
            } else {
                System.out.println("The biggest number is: " + three);
            }
        } else if (two > one) {
            if (two >= three) {
                System.out.println("The biggest number is: " + two);
            } else {
                System.out.println("The biggest number is: " + three);
            }
        } else {
            if (one > three) {
                System.out.println("The biggest number is: " + one);
            } else if (one < three) {
                System.out.println("The biggest number is: " + three);
            } else {
                System.out.println("All numbers are equal");
            }
        }
    }
}

