using System;
using System.Media;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace clase_7_poo_inicio.clases
{
    class ClsAutomovil
    {

        public string marca { get; }//quitamos el st para que no se pueda cambiar la marca
        public int vel_max { get; } //si pongo private en vez de public no lo puede acceder el usuario
        private int velocidadActual { get; set; } //si pongo private no lo puede acceder el usuario
        public string color { get; set; }
        private bool encendido = false;
        SoundPlayer sonidoEncendido=new SoundPlayer(@"C:\Users\linda\Desktop\umg linda daniela\encendeer.wav") ;
        SoundPlayer sonidoAcelerar = new SoundPlayer(@"C:\Users\linda\Desktop\umg linda daniela\acelerar.wav");
        SoundPlayer sonidoFrenar = new SoundPlayer(@"C:\Users\linda\Desktop\umg linda daniela\frenocarro.wav");
        SoundPlayer sonidoRadio = new SoundPlayer(@"C:\Users\linda\Desktop\umg linda daniela\radio.wav");

        public string radio()
        {
            if(encendido)
            {
                this.sonidoRadio.Play();
                return "Radio encendido ";
            }
            else
            {
                return "el radio no puede encenderse, el carro está apagado";
            }       
        }
        public string apagar()
        {
            if (encendido)
            {
                encendido = false;
                return "el carro se apagó";
               

            }
            else
            {
                return "el carro ya está apagado";
            }
        }
       public string Frenar()
        {
            if (velocidadActual>1)
            {
                this.sonidoFrenar.Play();
                velocidadActual = 0;
                return "listo!! el carro frenó ";

            }
            else
            {
                return "el carro no puede frenar porque no hay aceleracion ";
            }
        }

        public string Acelerar()
        {
            this.sonidoAcelerar.Play();
            velocidadActual = velocidadActual + 10;
            if (velocidadActual > vel_max)
            {
                return "lo lamento, llegaste a la velocidad maxima";
            }
            else
            {
                return $"vas a {velocidadActual} km por hora";
            }
        }
        public bool EstaEncendido()
        {
            return encendido;
        }
        public ClsAutomovil(string marcaCarro, int velocidadMx)//creando clase constructor para agregar valores al carro que el usuario no pueda modificar porque esta en pivate
        {
            this.marca = marcaCarro;
            this.vel_max = velocidadMx;
        }

        public ClsAutomovil()
        {
        }

        public string EncenderMotor()
        {
            if (encendido)
            {
                return "el carro ya esta encendido ";
            }
            else
            {
                this.sonidoEncendido.Play();
               encendido = true;
                velocidadActual = 0;
                return "Listo!! carro encendido";
            }
            
        }
    }
}
