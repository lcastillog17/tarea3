using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using Xamarin.Forms;
using Xamarin.Forms.Xaml;

namespace examen1
{
    [XamlCompilation(XamlCompilationOptions.Compile)]
    public partial class adivinacumple : ContentPage
    {
        public adivinacumple()
        {
            InitializeComponent();
        }
        private void Button_Clicked_2(object sender, EventArgs e)
        {
            var numero2 = Convert.ToDouble(numero1.Text)-365;
            if (numero2 >= 1000)
            {
                string conver = Convert.ToString(numero2);
                string dia = conver.Substring(0, 2);
                string meses = conver.Substring(conver.Length - 2, 2);
                dias.Text = dia.ToString();
                mese.Text = meses.ToString();

            }
            else
            {
                string conver = Convert.ToString(numero2);
                string dia = conver.Substring(0, 1);
                string meses = conver.Substring(1, 2);
                dias.Text = dia.ToString();
                mese.Text = meses.ToString();

            }
        }
    }
}