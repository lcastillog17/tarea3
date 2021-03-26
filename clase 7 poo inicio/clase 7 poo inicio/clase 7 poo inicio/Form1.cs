using clase_7_poo_inicio.clases;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace clase_7_poo_inicio
{
    public partial class Form1 : Form
    {


        ClsAutomovil carrito; //lo pongo aqui para que me permita usarlo en todas las clases
        public Form1()
        {
            InitializeComponent();
        }

        private void buttonInicio_Click(object sender, EventArgs e)
        {
            //crear el carro
           carrito = new ClsAutomovil("Meches",150);
            carrito.color = "blanco";
        
            //string respuesta = carrito.EncenderMotor();
            //labeldatos.Text = "encendido";
        }

        private void button3_Click(object sender, EventArgs e)
        {
            if (carrito.EstaEncendido())
            {
                labelVelocidad.Text = carrito.Acelerar();
            }
            else
            {
                MessageBox.Show($"lo lamento el carro{carrito.marca} esta apagado");
            }
        }

        private void encender_Click(object sender, EventArgs e)//clase de encender
        {
            string respuesta = carrito.EncenderMotor();
            labeldatos.Text = respuesta;
        }

        private void frenar_Click(object sender, EventArgs e)
        {
            string freno = carrito.Frenar();
            labelFreno.Text = freno;
            labelVelocidad.Text = "vas a 0 km por hora";
        }

        private void apagar_Click(object sender, EventArgs e)
        {
            string apago = carrito.apagar();
            labelApagar.Text = apago;
            labeldatos.Text = "carro apagado";
            labelFreno.Text = "-----";
            labelVelocidad.Text = "----";
        }

        private void radio_Click(object sender, EventArgs e)
        {
            string radi = carrito.radio();
            labelRadio.Text = radi;
        }
    }
    }

