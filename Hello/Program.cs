using System;


namespace Hello
{
    class Program
    {
        static void Main(string[] args)
        {
            String name=Console.ReadLine();
            Console.WriteLine("Hello "+name);

            Console.WriteLine("How many hours of sleep did you get?");
            int hours = int.Parse(Console.ReadLine());
            if (hours > 8)
            {
                Console.WriteLine("You had a great sleep!");
            }
            else
            {
                Console.WriteLine("You need more sleep!");
            }
        }
    }
}
