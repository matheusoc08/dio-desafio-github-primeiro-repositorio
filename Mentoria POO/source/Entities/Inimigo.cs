namespace Mentoria_POO.source.Entities
{
    public class Inimigo : Heroi
    {
        public Inimigo(string Nome, string ClasseFantastica) : base(Nome, ClasseFantastica)
        {
            this.Nome = Nome;
            this.ClasseFantastica = ClasseFantastica;
            this.Nivel = 1;
            this.PontosDeVida = 80;
            this.PontosDeMagia = 0;
        }

        public override string Atacar()
        {
            Random dado = new Random();
            int forcaAtaque = this.Nivel + dado.Next(1, 15);
            this.ValorUltimoAtaque = forcaAtaque;

            return this.Nome + " ataca e causa " + forcaAtaque + " de dano";
        }
    }
}