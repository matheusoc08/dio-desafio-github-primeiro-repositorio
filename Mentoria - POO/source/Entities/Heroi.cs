namespace Mentoria_POO.source.Entities
{
    public class Heroi
    {
        public string Nome { get; set; }
        public int PontosDeVida { get; set; }
        public int PontosDeMagia { get; set; }
        public int Nivel { get; set; }
        public string ClasseFantastica { get; set; }
        public int ValorUltimoAtaque { get; set; }

        public Heroi(string Nome, string ClasseFantastica)
        {
            this.Nome = Nome;
            this.ClasseFantastica = ClasseFantastica;
            this.Nivel = 1;
            this.PontosDeVida = 50;
            this.PontosDeMagia = 50;

        }

        public override string ToString()
        {
            return $"\nMeu nome é {this.Nome}\n" +
                $"Classe: {this.ClasseFantastica}\n" +
                $"Nivel: {this.Nivel}\n" +
                $"HP: {this.PontosDeVida}\n" +
                $"MP: {this.PontosDeMagia}";
        }

        public virtual string Atacar()
        {
            Random dado = new Random();
            int forcaAtaque = this.Nivel + dado.Next(1, 20);
            this.ValorUltimoAtaque = forcaAtaque;

            return $"Ataca com a sua espada causando {forcaAtaque} de dado";
        }

        public void ReceberDano(int danoRecebido)
        {
            this.PontosDeVida -= danoRecebido;
        }
    }

}