using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab06task04
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter the value of c1");
            int n = int.Parse(Console.ReadLine());
            Console.WriteLine("Enter the value of c2");
            int y = int.Parse(Console.ReadLine());
            Circle c1 = new Circle(n);
            Circle c2 = new Circle(y);
            Circle c3 = c1 + c2;
            c1.display();
            c2.display();
            c3.display();
        }
    }
}
