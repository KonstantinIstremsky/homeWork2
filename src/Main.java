public class Main {

    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println("Значение_1 dog = " + dog);
        dog += 4;
        System.out.println("Значение_2 dog = " + dog);
        dog -= 3.5;
        System.out.println("Значение_3 dog = " + dog);

        var cat = 3.6;
        System.out.println("Значение_1 cat = " + cat);
        cat += 4;
        System.out.println("Значение_2 cat = " + cat);
        cat -= 1.6;
        System.out.println("Значение_3 cat = " + cat);

        var paper = 763789;
        System.out.println("Значение_1 paper = " + paper);
        paper += 4;
        System.out.println("Значение_2 paper = " + paper);
        paper -= 7639;
        System.out.println("Значение_3 paper = " + paper);

        var friend = 19;
        System.out.println("Значение_1 friend = " + friend);
        friend += 2;
        System.out.println("Значение_2 friend = " + friend);
        friend /= 7;
        System.out.println("Значение_3 friend = " + friend);

        var frog = 3.5;
        System.out.println("Значение_1 frog = " + frog);
        frog *= 10;
        System.out.println("Значение_2 frog = " + frog);
        frog /= 3.5;
        System.out.println("Значение_3 frog = " + frog);
        frog += 4;
        System.out.println("Значение_4 frog = " + frog);

        double massBoxer1 = 78.2;
        double massBoxer2 = 82.7;
        double total_mass = massBoxer1 + massBoxer2;
        System.out.println("Общая масса боксёров = " + total_mass + "кг");
        double mass_difference = Math.abs(massBoxer1 - massBoxer2);
        System.out.println("Разница масс боксёров = " + mass_difference + "кг");
        double stresses = Math.max(massBoxer1, massBoxer2) % Math.min(massBoxer1, massBoxer2);
        System.out.println("Остаток от деления масс боксёров = " + stresses);

        var allJiraHour = 640;
        var everyPeopleWork = 8;
        var howManyPeople = allJiraHour / everyPeopleWork;
        System.out.println("Всего работников в компании — " + howManyPeople + " человек");
        howManyPeople += 94;
        var allWorkHour = howManyPeople * everyPeopleWork;
        System.out.println("Если в компании работает " + howManyPeople + " человека, то всего " + allWorkHour + " часов работы может быть поделено между сотрудниками");
    }
}