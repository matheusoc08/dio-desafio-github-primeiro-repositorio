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
    public partial class frmControleSerie : Form
    {
        public frmControleSerie()
        {
            InitializeComponent();
        }
       
        private void button2_Click(object sender, EventArgs e)
        {

        }

        private void frmControleSerie_Load(object sender, EventArgs e)
        {

        }

        private void btnSalvar_Click(object sender, EventArgs e)
        {
            DaoSerie c = new DaoSerie();

            try
            {
                if (txtCodigo.Text == "")
                {
                    c.InserirSerie(int.Parse(txtGenero.Text), txtTitulo.Text, txtDescricao.Text, int.Parse(txtAno.Text));
                    MessageBox.Show($"Série inserida com sucesso!", "Inserção", MessageBoxButtons.OK, MessageBoxIcon.Information);
                }
                else
                {
                    var pergunta = MessageBox.Show("Tem certeza que deseja atualizar essa série?", "Aviso", MessageBoxButtons.YesNo, MessageBoxIcon.Warning);
                    
                    if (pergunta == DialogResult.Yes)
                    {
                        c.AtualizarSerie(int.Parse(txtCodigo.Text), int.Parse(txtGenero.Text), txtTitulo.Text, txtDescricao.Text, int.Parse(txtAno.Text));
                        MessageBox.Show($"Série atualizada com sucesso!", "Atualização", MessageBoxButtons.OK, MessageBoxIcon.Information);
                    }
                    
                }
            }
            catch(Exception)
            {
                MessageBox.Show($"Os campos Titulo, Genero, Ano e Descrição não podem estar vazios", "Aviso", MessageBoxButtons.OK, MessageBoxIcon.Information);
            }
                 
        }

        private void txtCodigo_KeyPress(object sender, KeyPressEventArgs e)
        {

            if(!char.IsNumber(e.KeyChar) && !char.IsControl(e.KeyChar))
                e.Handled = true;
        }

        private void txtAno_KeyPress(object sender, KeyPressEventArgs e)
        {
            if (!char.IsNumber(e.KeyChar) && !char.IsControl(e.KeyChar))
                e.Handled = true;
        }

        private void txtGenero_KeyPress(object sender, KeyPressEventArgs e)
        {
            if (!char.IsNumber(e.KeyChar) && !char.IsControl(e.KeyChar))
                e.Handled = true;
        }
    }
}
