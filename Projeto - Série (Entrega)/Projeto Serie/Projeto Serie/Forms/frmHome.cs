using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Projeto_Serie.Forms
{
    public partial class frmHome : Form
    {
        public frmHome()
        {
            InitializeComponent();
        }

        private void btnInserir_Click(object sender, EventArgs e)
        {
            var frm = new frmControleSerie();
            frm.ShowDialog();
        }

        private void btnListar_Click(object sender, EventArgs e)
        {
            var frm = new frmListarSerie();
            frm.ShowDialog();
        }
    }
}
