
namespace clase_7_poo_inicio
{
    partial class Form1
    {
        /// <summary>
        /// Variable del diseñador necesaria.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Limpiar los recursos que se estén usando.
        /// </summary>
        /// <param name="disposing">true si los recursos administrados se deben desechar; false en caso contrario.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Código generado por el Diseñador de Windows Forms

        /// <summary>
        /// Método necesario para admitir el Diseñador. No se puede modificar
        /// el contenido de este método con el editor de código.
        /// </summary>
        private void InitializeComponent()
        {
            this.crear = new System.Windows.Forms.Button();
            this.encender = new System.Windows.Forms.Button();
            this.frenar = new System.Windows.Forms.Button();
            this.acelerar = new System.Windows.Forms.Button();
            this.apagar = new System.Windows.Forms.Button();
            this.labeldatos = new System.Windows.Forms.Label();
            this.labelVelocidad = new System.Windows.Forms.Label();
            this.labelFreno = new System.Windows.Forms.Label();
            this.labelApagar = new System.Windows.Forms.Label();
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.label5 = new System.Windows.Forms.Label();
            this.radio = new System.Windows.Forms.Button();
            this.label12 = new System.Windows.Forms.Label();
            this.labelRadio = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // crear
            // 
            this.crear.Location = new System.Drawing.Point(92, 119);
            this.crear.Name = "crear";
            this.crear.Size = new System.Drawing.Size(97, 24);
            this.crear.TabIndex = 0;
            this.crear.Text = "crear carro";
            this.crear.UseVisualStyleBackColor = true;
            this.crear.Click += new System.EventHandler(this.buttonInicio_Click);
            // 
            // encender
            // 
            this.encender.Location = new System.Drawing.Point(92, 163);
            this.encender.Name = "encender";
            this.encender.Size = new System.Drawing.Size(97, 37);
            this.encender.TabIndex = 1;
            this.encender.Text = "encender carro";
            this.encender.UseVisualStyleBackColor = true;
            this.encender.Click += new System.EventHandler(this.encender_Click);
            // 
            // frenar
            // 
            this.frenar.Location = new System.Drawing.Point(92, 260);
            this.frenar.Name = "frenar";
            this.frenar.Size = new System.Drawing.Size(97, 23);
            this.frenar.TabIndex = 2;
            this.frenar.Text = "frenar";
            this.frenar.UseVisualStyleBackColor = true;
            this.frenar.Click += new System.EventHandler(this.frenar_Click);
            // 
            // acelerar
            // 
            this.acelerar.Location = new System.Drawing.Point(92, 214);
            this.acelerar.Name = "acelerar";
            this.acelerar.Size = new System.Drawing.Size(97, 27);
            this.acelerar.TabIndex = 3;
            this.acelerar.Text = "acelerar";
            this.acelerar.UseVisualStyleBackColor = true;
            this.acelerar.Click += new System.EventHandler(this.button3_Click);
            // 
            // apagar
            // 
            this.apagar.Location = new System.Drawing.Point(92, 316);
            this.apagar.Name = "apagar";
            this.apagar.Size = new System.Drawing.Size(97, 23);
            this.apagar.TabIndex = 4;
            this.apagar.Text = "apagar";
            this.apagar.UseVisualStyleBackColor = true;
            this.apagar.Click += new System.EventHandler(this.apagar_Click);
            // 
            // labeldatos
            // 
            this.labeldatos.AutoSize = true;
            this.labeldatos.Location = new System.Drawing.Point(451, 125);
            this.labeldatos.Name = "labeldatos";
            this.labeldatos.RightToLeft = System.Windows.Forms.RightToLeft.No;
            this.labeldatos.Size = new System.Drawing.Size(0, 13);
            this.labeldatos.TabIndex = 5;
            // 
            // labelVelocidad
            // 
            this.labelVelocidad.AutoSize = true;
            this.labelVelocidad.Location = new System.Drawing.Point(440, 187);
            this.labelVelocidad.Name = "labelVelocidad";
            this.labelVelocidad.Size = new System.Drawing.Size(62, 13);
            this.labelVelocidad.TabIndex = 6;
            this.labelVelocidad.Text = "aceleracion";
            // 
            // labelFreno
            // 
            this.labelFreno.AutoSize = true;
            this.labelFreno.Location = new System.Drawing.Point(440, 244);
            this.labelFreno.Name = "labelFreno";
            this.labelFreno.Size = new System.Drawing.Size(31, 13);
            this.labelFreno.TabIndex = 7;
            this.labelFreno.Text = "freno";
            // 
            // labelApagar
            // 
            this.labelApagar.AutoSize = true;
            this.labelApagar.Location = new System.Drawing.Point(435, 321);
            this.labelApagar.Name = "labelApagar";
            this.labelApagar.Size = new System.Drawing.Size(40, 13);
            this.labelApagar.TabIndex = 8;
            this.labelApagar.Text = "apagar";
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.BackColor = System.Drawing.SystemColors.AppWorkspace;
            this.label1.ForeColor = System.Drawing.SystemColors.Desktop;
            this.label1.Location = new System.Drawing.Point(440, 52);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(35, 13);
            this.label1.TabIndex = 9;
            this.label1.Text = "Datos";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.BackColor = System.Drawing.SystemColors.Control;
            this.label2.ForeColor = System.Drawing.SystemColors.Highlight;
            this.label2.Location = new System.Drawing.Point(451, 102);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(51, 13);
            this.label2.TabIndex = 10;
            this.label2.Text = "ESTADO";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.BackColor = System.Drawing.SystemColors.Control;
            this.label3.ForeColor = System.Drawing.SystemColors.Highlight;
            this.label3.Location = new System.Drawing.Point(435, 163);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(82, 13);
            this.label3.TabIndex = 11;
            this.label3.Text = "ACELERACION";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.BackColor = System.Drawing.SystemColors.Control;
            this.label4.ForeColor = System.Drawing.SystemColors.Highlight;
            this.label4.Location = new System.Drawing.Point(435, 228);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(44, 13);
            this.label4.TabIndex = 12;
            this.label4.Text = "FRENO";
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.BackColor = System.Drawing.SystemColors.Control;
            this.label5.ForeColor = System.Drawing.SystemColors.Highlight;
            this.label5.Location = new System.Drawing.Point(429, 290);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(51, 13);
            this.label5.TabIndex = 13;
            this.label5.Text = "APAGAR";
            // 
            // radio
            // 
            this.radio.Location = new System.Drawing.Point(92, 367);
            this.radio.Name = "radio";
            this.radio.Size = new System.Drawing.Size(97, 24);
            this.radio.TabIndex = 14;
            this.radio.Text = "Encender radio";
            this.radio.UseVisualStyleBackColor = true;
            this.radio.Click += new System.EventHandler(this.radio_Click);
            // 
            // label12
            // 
            this.label12.AutoSize = true;
            this.label12.BackColor = System.Drawing.SystemColors.Control;
            this.label12.ForeColor = System.Drawing.SystemColors.Highlight;
            this.label12.Location = new System.Drawing.Point(429, 360);
            this.label12.Name = "label12";
            this.label12.Size = new System.Drawing.Size(41, 13);
            this.label12.TabIndex = 15;
            this.label12.Text = "RADIO";
            // 
            // labelRadio
            // 
            this.labelRadio.AutoSize = true;
            this.labelRadio.Location = new System.Drawing.Point(435, 373);
            this.labelRadio.Name = "labelRadio";
            this.labelRadio.Size = new System.Drawing.Size(39, 13);
            this.labelRadio.TabIndex = 16;
            this.labelRadio.Text = "estado";
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.labelRadio);
            this.Controls.Add(this.label12);
            this.Controls.Add(this.radio);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.labelApagar);
            this.Controls.Add(this.labelFreno);
            this.Controls.Add(this.labelVelocidad);
            this.Controls.Add(this.labeldatos);
            this.Controls.Add(this.apagar);
            this.Controls.Add(this.acelerar);
            this.Controls.Add(this.frenar);
            this.Controls.Add(this.encender);
            this.Controls.Add(this.crear);
            this.Name = "Form1";
            this.Text = "Form1";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button crear;
        private System.Windows.Forms.Button encender;
        private System.Windows.Forms.Button frenar;
        private System.Windows.Forms.Button acelerar;
        private System.Windows.Forms.Button apagar;
        private System.Windows.Forms.Label labeldatos;
        private System.Windows.Forms.Label labelVelocidad;
        private System.Windows.Forms.Label labelFreno;
        private System.Windows.Forms.Label labelApagar;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.Button radio;
        private System.Windows.Forms.Label label12;
        private System.Windows.Forms.Label labelRadio;
    }
}

