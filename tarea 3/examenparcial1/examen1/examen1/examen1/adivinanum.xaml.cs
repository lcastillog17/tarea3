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
    public partial class adivinanum : ContentPage
    {
        public adivinanum()
        {
            InitializeComponent();
        }
        private void Button_Clicked(object sender, EventArgs e)
        {
            var guarda = string.Copy(num1.Text);
            string num2 = Convert.ToString(guarda.Substring(0, guarda.Length - 1));
            Double resul = Convert.ToDouble(num2);
            Double resultado = resul - 4;
            nume.Text = resultado.ToString();
            DisplayAlert("EL NUMERO QUE PENSABAS ES: ", resultado.ToString(), "¡CORRECTO!");

        }
    }
}