using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Desafios
{
    public class Desafio001
    {
        public void teste()
        {

            Console.WriteLine("Insira a quantidade");
            int n = int.Parse(Console.ReadLine());

            int[] num = new int[n];

            // TODO: Crie as outras condições necessárias para a resolução do desafio:
            Console.WriteLine("Digite a sequencia");
            for (int i = 0; i < n; i++)
            {
                num[i] = int.Parse(Console.ReadLine());
            }
            Console.WriteLine($"\nMaior: {MajorityElement(num)}");
        }

        public static int MajorityElement(int[] nums)
        {
            int major = nums[0];
            int count = 0;
            for (int i = 0; i < nums.Length; i++)
            {
                if (count == 0)
                {
                    major = nums[i];
                    count++;
                }
                else
                {
                    if (major == nums[i])
                    {
                        count++;
                    }
                    else
                    {
                        count--;
                    }
                }
            }
            return major;
        }
    }
}