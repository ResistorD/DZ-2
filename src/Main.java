//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("ДОМАШКА 2");

        System.out.println("Задача 1");

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задача 2");

        dog + = 4;
        cat + = 4;
        paper + = 4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задача 3");

        dog - = 3.5;
        cat - = 1.6;
        paper - = 7639;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задача 4");

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        System.out.println("Задача 5");

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println("Задача 6");

        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        var totalWeight = boxer1Weight + boxer2Weight;
        var weightDifference = boxer2Weight - boxer1Weight;
        System.out.println("Общая масса двух боксеров: " + totalWeight + " кг");
        System.out.println("Разница между массами боксеров: " + weightDifference + " кг");

        System.out.println("Задача 7");

        var weightRemainder = boxer2Weight % boxer1Weight;
        System.out.println("Остаток от деления веса первого боксёра на вес второго: " + weightRemainder + " кг");

        System.out.println("Задача 8");

        var totalHours = 640;
        var hoursPerEmployee = 8;
        var numberOfEmployees = totalHours / hoursPerEmployee;
        System.out.println("Всего работников в компании — " + numberOfEmployees + " человек.");

        var increasedEmployees = numberOfEmployees + 94;
        var totalHoursWithIncreasedEmployees = increasedEmployees * hoursPerEmployee;
        System.out.println("Если в компании работает " + increasedEmployees + " человек, то всего " + totalHoursWithIncreasedEmployees + " часов работы может быть поделено между сотрудниками.");
        }
    }