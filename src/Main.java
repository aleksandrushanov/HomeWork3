public class Main {
    public static void main(String[] args) {

        System.out.println("Task1");
        int cat =4;
        System.out.println("Значение переменой cat типом int равно " + cat);
        byte dog = 110;
        System.out.println("Значение переменой dog типом byte равно " + dog);
        short frog = 170;
        System.out.println("Значение переменой frog типом short равно " + frog );
        long lion = 1324;
        System.out.println("Значение переменой lion типом long равно " + lion );
        float aplle= 4.5555555555F;
        System.out.println("Значение переменой aplle типом float равно " + aplle );
        double peach= 1.999999999999;
        System.out.println("Значение переменой peach типом double равно " + peach );

        System.out.println("Task 2");

        float f = 27.12f;
        System.out.println(f);
        long l = 987678965549L;
        System.out.println(l);
        byte b = 2;
        System.out.println(b);
        short s =786;
        System.out.println(s);
        boolean a = false;
        System.out.println(a);
        short q = 569;
        System.out.println(q);
        short w = -159;
        System.out.println(w);
        short x = 27897;
        System.out.println(x);
        byte y = 67;
        System.out.println(y);

        System.out.println("Task 3");
        byte lyudmilaPavlovna =23;
        System.out.println("Класс Людмилы Павловны " + lyudmilaPavlovna +" ученика");
        byte annaSergeevna= 27;
        System.out.println("Класс Анны Сергеевны " +annaSergeevna + " учеников" );
        byte catherineAndreyevna=30;
        System.out.println("Класс Екатерины Андреевны " + catherineAndreyevna + " учеников");
        short totalSheets = 480;
        System.out.println("Общее количество листов " + totalSheets);
        int numberStudents = annaSergeevna + lyudmilaPavlovna + catherineAndreyevna ;
        System.out.println("Общее количество учеников " + numberStudents);
        int sheets = totalSheets / numberStudents;
        System.out.println("На каждого ученика рассчитано " + sheets + " листов бумаги");

        System.out.println("Task 4");
        byte bottle = 16;
        System.out.println("Бутылок " + bottle);
        byte time2Minute = 2;
        System.out.println("Время рыботы " + time2Minute);
        int bottle1Minute = bottle / time2Minute;
        System.out.println("За одну минуту станок делает " + bottle1Minute + " бутылок");
        int bottle20Minute = bottle1Minute * 20;
        System.out.println("За 20 минут машины произвела бутылок " + bottle20Minute + " штук" );
        int bottle1Hours = bottle1Minute * 60;
        System.out.println("За 1 час машина производит " + bottle1Hours + " штук" );
        int bottle1Day = bottle1Hours * 24;
        System.out.println("За сутки машина произвела бутылок " + bottle1Day  + " штук");
        int bottle3Day = bottle1Day * 3;
        System.out.println("За трое суток машина произвела бутылок " + bottle3Day  + " штук");
        int bottle1month = bottle1Day * 30;
        System.out.println("За месяц машина произвела бутылок " + bottle1month  + " штук");

        System.out.println("Task 5");
        short totalBottle = 120;
        System.out.println("На ремонт школы тебуется " + totalBottle + " штук" );
        short oneClass = 2 + 4;
        System.out.println("На один клас требуется " + oneClass + " банок краски , 2 белой и 4 коричневой");
        int totalClasses = totalBottle / oneClass;
        System.out.println("В школе " + totalClasses + " классов");
        int whiteBottle = totalClasses * 2;
        int brownBottle = totalClasses * 4;
        System.out.println("В школе, где " + totalClasses +" классов, нужно " + whiteBottle + " банок белой краски и " + brownBottle + " банок коричневой краски ");

        System.out.println("Task 6");
        int bananas1 = 80;
        int bananas = 5;
        System.out.println("Всего " + bananas + " , один банан весит " + bananas1 + " грамм");
        int milk = 200;
        int milk100 = 105;
        System.out.println("Молока " + milk + "мл , 100 мл = " + milk100 + " грамм");
        int iceCream = 2;
        int iceCreamWeight = 100;
        System.out.println("Мороженое " + iceCream + " штуки, вес одного = " + iceCreamWeight + " грамм");
        int eggs = 4;
        int egg = 70;
        System.out.println("Всего " + eggs + " яйца, вес одного " + egg + " грамм");
        int totalgramm = (bananas * bananas1) + (milk100 * 2) + (iceCreamWeight * iceCream )+ (eggs * egg);
        System.out.println("Всего " + totalgramm + " грамм");
        float kilogram = 1000;
        System.out.println("1 киллограмм = " + kilogram + " грамм" );
        float translation = totalgramm / kilogram;
        System.out.println("Вес всех продуктов = " + translation + " киллограм");
        System.out.println("Task 7");
        short weight250 = 250;
        short weight500 = 500;
        System.out.println("Потеря вес на " + weight250 + " грамм, потеря веса на " + weight500 + " грамм");
        short oneKg = 1000;
        System.out.println("Один килограмм = " + oneKg + " грамм" );
        int totalWeight = oneKg *7;
        System.out.println("Спортсмену  нужнно похудеть на " + totalWeight + " грамм");
        int day250Gramm = totalWeight / weight250;
        System.out.println("Если Спортсмен худеет по " + weight250 + " грамм, то потребуется " + day250Gramm + " дней" );
        int day500Gramm = totalWeight / weight500;
        System.out.println("Если Спортсмен худеет по " + weight500 + " грамм, то потребуется " + day500Gramm + " дней" );
        int averageLoss = (weight500 + weight250)/2;
        System.out.println("Средняя потеря веса в день " + averageLoss);
        int dayAveageLoss = totalWeight / averageLoss;
        System.out.println("При средней потери веса " + averageLoss + " грамм, потребуется " + dayAveageLoss + " дней");

        System.out.println("Task 8");
        int masha = 67760;
        float dopMasha = (masha * 0.1F) + masha;
        float differenceMasha = (dopMasha * 12) - (masha * 12);
        System.out.println("Маша теперь получает " + dopMasha + " рублей. Годовой доход вырос на " + differenceMasha + " рублей");

        int denis = 83690;
        float dopDenis = (denis * 0.1F) + denis;
        float differenceDenis = (dopDenis*12) - ( denis*12);
        System.out.println("Денис теперь получает " + dopDenis + " рублей. Годовой доход вырос на " + differenceDenis + " рублей" );

        int krestina = 76230;
        float dopKrestina = (krestina * 0.1F) + krestina;
        float differenceKrestina = (dopKrestina*12) - (krestina*12);
        System.out.println("Кристина теперь получае " + dopKrestina + " рублей. Годовой доход вырос на " + differenceKrestina + " рублей" );


    }
}