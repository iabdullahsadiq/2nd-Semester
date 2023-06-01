using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab06task06
{
    class Program
    {
        static void Main(string[] args)
        {
            Time time1 = new Time(10, 30, 45);
            Time time2 = new Time(5, 15, 30);
            Time time3 = time1 + time2;
            Console.WriteLine("Time 1:");
            time1.PrintTime();
            Console.WriteLine("Time 2:");
            time2.PrintTime();
            Console.WriteLine("Time 1 + Time 2:");
            time3.PrintTime();
            Console.WriteLine("Time 1 < Time 2: " + (time1 < time2));
            Console.WriteLine("Time 1 > Time 2: " + (time1 > time2));
            Console.WriteLine("Time 1 < Time 3: " + (time1 < time3));
            Console.WriteLine("Time 1 > Time 3: " + (time1 > time3));
        }
    }
}
