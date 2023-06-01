using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab06task06
{
    class Time
    {
        int hours, minutes, seconds;
        public Time()
        {
            this.hours = 0;
            this.minutes = 0;
            this.seconds = 0;
        }
        public Time(int hours, int minutes, int seconds)
        {
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
        }
        public void PrintTime()
        {
            Console.WriteLine("{0:D2}:{1:D2}:{2:D2}", hours, minutes, seconds);
        }
        public static Time operator +(Time a, Time b)
        {
            Time T = new Time();
            T.hours = a.hours + b.hours;
            T.minutes = a.minutes + b.minutes;
            T.seconds = a.seconds + b.seconds;
            if (T.seconds >= 60)
            {
                T.minutes++;
                T.seconds -= 60;
            }
            if (T.minutes >= 60)
            {
                T.hours++;
                T.minutes -= 60;
            }
            if (T.hours >= 24)
            {
                T.hours -= 24;
            }
            return T;
        }
        public static bool operator <(Time a, Time b)
        {
            if (a.hours < b.hours)
            {
                return true;
            }
            else if (a.hours == b.hours && a.minutes < b.minutes)
            {
                return true;
            }
            else if (a.hours == b.hours && a.minutes == b.minutes && a.seconds <
           b.seconds)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        public static bool operator >(Time a, Time b)
        {
            if (a.hours > b.hours)
            {
                return true;
            }
            else if (a.hours == b.hours)
            {
                if (a.minutes > b.minutes)
                {
                    return true;
                }
                else if (a.minutes == b.minutes)
                {
                    if (a.seconds > b.seconds)
                    {
                        return true;
                    }
                    else
                    {
                        return false;
                    }
                }
                else
                {
                    return false;
                }
            }
            else
            {
                return false;
            }
        }
    }
}
