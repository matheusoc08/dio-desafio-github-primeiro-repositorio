using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Data.SqlClient;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using Projeto_Serie.Dao;

namespace Projeto_Serie.Forms
{
    public partial class frmListarSerie : Form
    {
        public frmListarSerie()
        {
            InitializeComponent();            
        }

        private void frmListarSerie_Load(object sender, EventArgs e)
        {

        }

        private void dataGridView1_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {

        }

        private void btnBusca_Click(object sender, EventArgs e)
        {
            DaoSerie c = new DaoSerie();

            var id = txtCodigo.Text;

            if (id == "")
            {
                id = "0";
            }

            var codigo = int.Parse(id);
            var titulo = (txtTitulo.Text != "" ? txtTitulo.Text : "_invalido_");
            
            if (codigo != 0 || titulo != "_invalido_")
            {
                dataGridView1.ReadOnly = true;
                dataGridView1.DataSource = c.SelecionarSerie(codigo, titulo).Tables[0];                
            }
            else
            {
                dataGridView1.ReadOnly = true;
                dataGridView1.DataSource = c.SelecionarSerie().Tables[0];
            }

        }

        private void btnExcluir_Click(object sender, EventArgs e)
        {
            DaoSerie c = new DaoSerie();

            var id = txtCodigo.Text;

            if(id == "")
            {
                MessageBox.Show("Por favor, informe o código da série a ser deletada.", "Aviso", MessageBoxButtons.OK, MessageBoxIcon.Warning);
            }
            else
            {
                var pergunta = MessageBox.Show("Tem certeza que deseja deletar essa série?", "Aviso", MessageBoxButtons.YesNo, MessageBoxIcon.Warning);

                if (pergunta == DialogResult.Yes)
                {
                    c.DeletarSerie(int.Parse(id));
                    MessageBox.Show("A série foi deletada com sucesso!", "Aviso", MessageBoxButtons.OK, MessageBoxIcon.Warning);
                }
            }
            
        }

        private void btnAtualizar_Click(object sender, EventArgs e)
        {
            var frm = new frmControleSerie();
            frm.ShowDialog();
        }

        private void txtCodigo_KeyPress(object sender, KeyPressEventArgs e)
        {
            if (!char.IsNumber(e.KeyChar) && !char.IsControl(e.KeyChar))
                e.Handled = true;
        }
    }
}
