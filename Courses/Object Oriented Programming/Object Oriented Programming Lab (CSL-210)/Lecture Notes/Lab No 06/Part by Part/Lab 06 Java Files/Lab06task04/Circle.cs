using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab06task04
{
    class Circle
    {
        int radius;
        public Circle()
        {
            this.radius = 0;
        }
        public Circle(int radius)
        {
            this.radius = radius;
        }
        public void display()
        {
            Console.WriteLine("Radius is " + radius);
        }
        public static Circle operator +(Circle c1, Circle c2)
        {
            Circle c3 = new Circle();
            c3.radius = c1.radius + c2.radius;
            return c3;
        }
    }
}
