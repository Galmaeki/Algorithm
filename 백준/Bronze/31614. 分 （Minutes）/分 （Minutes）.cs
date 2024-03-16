using System;

namespace baekjoon
{
    class Program
    {
        static void Main(string[] args)
        {
            string h = Console.ReadLine();
            string m = Console.ReadLine();
            
            Console.WriteLine((int.Parse(h)*60) + int.Parse(m));
        }
    }
}