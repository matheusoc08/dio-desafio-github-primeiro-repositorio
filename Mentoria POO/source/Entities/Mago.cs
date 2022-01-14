namespace Mentoria_POO.source.Entities
{
    public class Mago : Heroi
    {
        public Mago(string Nome, string ClasseFantastica) : base(Nome, ClasseFantastica)
        {
            this.Nome = Nome;
            this.ClasseFantastica = ClasseFantastica;
            this.Nivel = 1;
            this.PontosDeVida = 50;
            this.PontosDeMagia = 50;
        }

        public override string Atacar()
        {
            Random dado = new Random();
            int forcaAtaque = this.Nivel + dado.Next(1, 10);
            this.ValorUltimoAtaque = forcaAtaque;

            return $"Ataca com o seu cajado causando {forcaAtaque} de dado";

        }

        public string Atacar(int bonus)
        {
            Random dado = new Random();
            int forcaAtaque = this.Nivel + dado.Next(1, 10) + bonus;
            return this.Nome + " ataca encantando seu cajado e causa " + forcaAtaque + " de dano";
        }
    }
}