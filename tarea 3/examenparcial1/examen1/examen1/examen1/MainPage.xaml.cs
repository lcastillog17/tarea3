using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Xamarin.Forms;

namespace examen1
{
    public partial class MainPage : ContentPage
    {
        public MainPage()
        {
            InitializeComponent();
        }

        private void Button_Clicked(object sender, EventArgs e)
        {
            numpens.Clicked += Numpens_Clicked;
        }

        private void Numpens_Clicked(object sender, EventArgs e)
        {
            Navigation.PushAsync(new adivinanum());
        }

        private void Button_Clicked_1(object sender, EventArgs e)
        {
            cumple.Clicked += Cumple_Clicked; ;
        }

        private void Cumple_Clicked(object sender, EventArgs e)
        {
            Navigation.PushAsync(new adivinacumple());
        }
    }
}
