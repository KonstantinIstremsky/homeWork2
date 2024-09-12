public class Main {

    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println("Значение_1 dog = " + dog);
        dog = dog + 4;
        System.out.println("Значение_2 dog = " + dog);
        dog = dog - 3.5;
        System.out.println("Значение_3 dog = " + dog);

        var cat = 3.6;
        System.out.println("Значение_1 cat = " + cat);
        cat = cat + 4;
        System.out.println("Значение_2 cat = " + cat);
        cat = cat - 1.6;
        System.out.println("Значение_3 cat = " + cat);

        var paper = 763789;
        System.out.println("Значение_1 paper = " + paper);
        paper = paper + 4;
        System.out.println("Значение_2 paper = " + paper);
        paper = paper - 7639;
        System.out.println("Значение_3 paper = " + paper);

        var friend = 19;
        System.out.println("Значение_1 friend = " + friend);
        friend = friend + 2;
        System.out.println("Значение_2 friend = " + friend);
        friend =  friend / 7;
        System.out.println("Значение_3 friend = " + friend);

        var frog = 3.5;
        System.out.println("Значение_1 frog = " + frog);
        frog = frog * 10;
        System.out.println("Значение_2 frog = " + frog);
        frog = frog / 3.5;
        System.out.println("Значение_3 frog = " + frog);
        frog = frog + 4;
        System.out.println("Значение_4 frog = " + frog);

        double mass_boxer1 = 78.2;
        double mass_boxer2 = 82.7;
        double total_mass = mass_boxer1 + mass_boxer2;
        System.out.println("Общая масса боксёров = " + total_mass + "кг");
        double mass_difference = Math.max(mass_boxer1, mass_boxer2) - Math.min(mass_boxer1, mass_boxer2);
        System.out.println("Разница масс боксёров = " + mass_difference + "кг");
        double stresses = Math.max(mass_boxer1, mass_boxer2) % Math.min(mass_boxer1, mass_boxer2);
        System.out.println("Остаток от деления масс боксёров = " + stresses);

        var all_Jira_hour = 640;
        var every_people_work = 8;
        var how_many_people = all_Jira_hour / every_people_work;
        System.out.println("Всего работников в компании — " + how_many_people + " человек");
        how_many_people = how_many_people + 94;
        var all_work_hour = how_many_people * every_people_work;
        System.out.println("Если в компании работает " + how_many_people + " человека, то всего " + all_work_hour + " часов работы может быть поделено между сотрудниками");
    }
}