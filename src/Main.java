public class Main {
    public static void main(String[] args)
    {


        int years = 0;
        if(years<18)
        {
            System.out.println("возраст севершеннолетия еще не наступил");
        }
        else
        {
            System.out.println("возраст наступил");
        }



        int Celsia = 0;
        if(Celsia<5)
        {
            System.out.println("На улице холодно, нужно надеть шапку");
        }
        else
        {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }



        int Speed = 0;
        if(Speed>=60)
        {
            System.out.println("скорость превышена");
        }
        else
        {
            System.out.println("превышения скорости нет");
        }



        int Years = 0;
        if(Years > 2 && Years < 6)
        {
            System.out.println("Если возраст человека равен " + Years + ", то ему нужно ходить в детский сад");
        }
        else if(Years > 7 && Years < 17)
        {
            System.out.println("Если возраст человека равен " + Years + ", то ему нужно ходить в школу");
        }
        else if(Years >= 18 && Years <= 24)
        {
            System.out.println("Если возраст человека равен " + Years + ", то ему нужно ходить в университет");
        }
        else if(Years > 24)
        {
            System.out.println("Если возраст человека равен " + Years + ", то ему нужно ходить на работу");
        }



        int age = 0;

        if (age < 5)
        {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        }
        else if (age >= 5 && age <= 14)
        {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        else
        {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }



        int passengers = 0;

        if (passengers < 60)
        {
            System.out.println("Есть сидячее место");
        }
        else if (passengers < 102)
        {
            System.out.println("Есть стоячее место");
        }
        else
        {
            System.out.println("Вагон уже полностью забит");
        }


        int one = 0;
        int two = 2;
        int three = 3;

        if (one >= two && one >= three)
        {
            System.out.println("Наибольшее число: " + one);
        }
        else if (two >= one && two >= three)
        {
            System.out.println("Наибольшее число: " + two);
        }
        else
        {
            System.out.println("Наибольшее число: " + three);
        }
    }
}
