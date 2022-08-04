using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace TrieDictionary
{
    public partial class Form1 : Form 
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            trie t = new trie();
            t.Library();
            if (t.search(textBox1.Text) == "")
                textBox2.Text = "Not Found";
            else
                textBox2.Text = t.search(textBox1.Text);
        }
    }
}
