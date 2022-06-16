namespace ExemploPOO.Models
{
    public class Retangulo
    {
        private double comprimento { get; set; }
        private double largura { get; set; }
        private bool valido { get; set; }

        public void DefinirMedidas(double comprimento, double largura)
        {
            if (comprimento > 0 && largura > 00)
            {
                this.comprimento = comprimento;
                this.largura = largura;
                valido = true;
            }
            else
            {
                System.Console.WriteLine("Valores inválidos!");
            }
        }

        public double ObterArea()
        {
            if (valido)
            {
                return comprimento * largura;
            }
            else
            {
                System.Console.WriteLine("Preencha valores válidos!");
                return 0;
            }

        }
    }
}