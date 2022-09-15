using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Newtonsoft.Json;

namespace Modulo_2.Models
{
    public class VendasRecebidas
    {
        public int Id { get; set; }
        // Modificação de atributo para que, caso o Json venha com a propriedade num formato diferente, o C# capte e aplique conforme a conveção acordada
        [JsonProperty("Nome_Produto")]
        public string Produto { get; set; }
        public decimal Preco { get; set; }
        public DateTime DataVenda { get; set; }

        public decimal? Desconto { get; set; }
    }
}