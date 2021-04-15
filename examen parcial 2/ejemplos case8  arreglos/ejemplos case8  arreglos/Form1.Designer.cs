
namespace ejemplos_case8__arreglos
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
            this.buttonArreglo = new System.Windows.Forms.Button();
            this.listBoxResultado = new System.Windows.Forms.ListBox();
            this.buttonCargar = new System.Windows.Forms.Button();
            this.textBoxContenido = new System.Windows.Forms.TextBox();
            this.buttonNombres = new System.Windows.Forms.Button();
            this.listBoxNombres = new System.Windows.Forms.ListBox();
            this.Promparcial1 = new System.Windows.Forms.Button();
            this.Promparcial2 = new System.Windows.Forms.Button();
            this.Promparcial3 = new System.Windows.Forms.Button();
            this.labelParcial1 = new System.Windows.Forms.Label();
            this.labelParcial2 = new System.Windows.Forms.Label();
            this.labelParcial3 = new System.Windows.Forms.Label();
            this.listBoxProm = new System.Windows.Forms.ListBox();
            this.PromAlumno = new System.Windows.Forms.Button();
            this.label1 = new System.Windows.Forms.Label();
            this.MayorNota = new System.Windows.Forms.Button();
            this.MenorNota = new System.Windows.Forms.Button();
            this.labelNomMayor = new System.Windows.Forms.Label();
            this.labelNomMenor = new System.Windows.Forms.Label();
            this.labelNotaMayor = new System.Windows.Forms.Label();
            this.labelNotaMenor = new System.Windows.Forms.Label();
            this.button1 = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // buttonArreglo
            // 
            this.buttonArreglo.Location = new System.Drawing.Point(588, 173);
            this.buttonArreglo.Name = "buttonArreglo";
            this.buttonArreglo.Size = new System.Drawing.Size(75, 23);
            this.buttonArreglo.TabIndex = 0;
            this.buttonArreglo.Text = "Arreglo";
            this.buttonArreglo.UseVisualStyleBackColor = true;
            this.buttonArreglo.Click += new System.EventHandler(this.buttonArreglo_Click);
            // 
            // listBoxResultado
            // 
            this.listBoxResultado.FormattingEnabled = true;
            this.listBoxResultado.Location = new System.Drawing.Point(536, 202);
            this.listBoxResultado.Name = "listBoxResultado";
            this.listBoxResultado.Size = new System.Drawing.Size(145, 173);
            this.listBoxResultado.TabIndex = 1;
            // 
            // buttonCargar
            // 
            this.buttonCargar.Location = new System.Drawing.Point(12, 12);
            this.buttonCargar.Name = "buttonCargar";
            this.buttonCargar.Size = new System.Drawing.Size(75, 23);
            this.buttonCargar.TabIndex = 2;
            this.buttonCargar.Text = "Cargar archivo";
            this.buttonCargar.UseVisualStyleBackColor = true;
            this.buttonCargar.Click += new System.EventHandler(this.buttonCargar_Click);
            // 
            // textBoxContenido
            // 
            this.textBoxContenido.Location = new System.Drawing.Point(103, 14);
            this.textBoxContenido.Multiline = true;
            this.textBoxContenido.Name = "textBoxContenido";
            this.textBoxContenido.ScrollBars = System.Windows.Forms.ScrollBars.Both;
            this.textBoxContenido.Size = new System.Drawing.Size(370, 126);
            this.textBoxContenido.TabIndex = 3;
            // 
            // buttonNombres
            // 
            this.buttonNombres.Location = new System.Drawing.Point(12, 146);
            this.buttonNombres.Name = "buttonNombres";
            this.buttonNombres.Size = new System.Drawing.Size(126, 23);
            this.buttonNombres.TabIndex = 4;
            this.buttonNombres.Text = "Nombres en orden";
            this.buttonNombres.UseVisualStyleBackColor = true;
            this.buttonNombres.Click += new System.EventHandler(this.buttonNombres_Click);
            // 
            // listBoxNombres
            // 
            this.listBoxNombres.FormattingEnabled = true;
            this.listBoxNombres.Location = new System.Drawing.Point(12, 175);
            this.listBoxNombres.Name = "listBoxNombres";
            this.listBoxNombres.Size = new System.Drawing.Size(229, 173);
            this.listBoxNombres.TabIndex = 5;
            this.listBoxNombres.SelectedIndexChanged += new System.EventHandler(this.listBox1_SelectedIndexChanged);
            // 
            // Promparcial1
            // 
            this.Promparcial1.Location = new System.Drawing.Point(259, 172);
            this.Promparcial1.Name = "Promparcial1";
            this.Promparcial1.Size = new System.Drawing.Size(110, 23);
            this.Promparcial1.TabIndex = 6;
            this.Promparcial1.Text = "promedio parcial 1";
            this.Promparcial1.UseVisualStyleBackColor = true;
            this.Promparcial1.Click += new System.EventHandler(this.Promparcial1_Click);
            // 
            // Promparcial2
            // 
            this.Promparcial2.Location = new System.Drawing.Point(259, 231);
            this.Promparcial2.Name = "Promparcial2";
            this.Promparcial2.Size = new System.Drawing.Size(110, 23);
            this.Promparcial2.TabIndex = 7;
            this.Promparcial2.Text = "promedio parcial 2";
            this.Promparcial2.UseVisualStyleBackColor = true;
            this.Promparcial2.Click += new System.EventHandler(this.Promparcial2_Click);
            // 
            // Promparcial3
            // 
            this.Promparcial3.Location = new System.Drawing.Point(259, 294);
            this.Promparcial3.Name = "Promparcial3";
            this.Promparcial3.Size = new System.Drawing.Size(110, 23);
            this.Promparcial3.TabIndex = 8;
            this.Promparcial3.Text = "promedio parcial 3";
            this.Promparcial3.UseVisualStyleBackColor = true;
            this.Promparcial3.Click += new System.EventHandler(this.Promparcial3_Click);
            // 
            // labelParcial1
            // 
            this.labelParcial1.AutoSize = true;
            this.labelParcial1.Location = new System.Drawing.Point(259, 202);
            this.labelParcial1.Name = "labelParcial1";
            this.labelParcial1.Size = new System.Drawing.Size(91, 13);
            this.labelParcial1.TabIndex = 9;
            this.labelParcial1.Text = "Promedio parcial1";
            // 
            // labelParcial2
            // 
            this.labelParcial2.AutoSize = true;
            this.labelParcial2.Location = new System.Drawing.Point(259, 268);
            this.labelParcial2.Name = "labelParcial2";
            this.labelParcial2.Size = new System.Drawing.Size(91, 13);
            this.labelParcial2.TabIndex = 10;
            this.labelParcial2.Text = "Promedio parcial2";
            // 
            // labelParcial3
            // 
            this.labelParcial3.AutoSize = true;
            this.labelParcial3.Location = new System.Drawing.Point(259, 332);
            this.labelParcial3.Name = "labelParcial3";
            this.labelParcial3.Size = new System.Drawing.Size(91, 13);
            this.labelParcial3.TabIndex = 11;
            this.labelParcial3.Text = "Promedio parcial3";
            // 
            // listBoxProm
            // 
            this.listBoxProm.FormattingEnabled = true;
            this.listBoxProm.Location = new System.Drawing.Point(479, 19);
            this.listBoxProm.Name = "listBoxProm";
            this.listBoxProm.Size = new System.Drawing.Size(91, 121);
            this.listBoxProm.TabIndex = 12;
            this.listBoxProm.SelectedIndexChanged += new System.EventHandler(this.listBoxProm_SelectedIndexChanged);
            // 
            // PromAlumno
            // 
            this.PromAlumno.Location = new System.Drawing.Point(576, 19);
            this.PromAlumno.Name = "PromAlumno";
            this.PromAlumno.Size = new System.Drawing.Size(75, 34);
            this.PromAlumno.TabIndex = 13;
            this.PromAlumno.Text = "Promedio por alumnos";
            this.PromAlumno.UseVisualStyleBackColor = true;
            this.PromAlumno.Click += new System.EventHandler(this.PromAlumno_Click);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(466, 3);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(129, 13);
            this.label1.TabIndex = 14;
            this.label1.Text = "promedio de cada alumno";
            // 
            // MayorNota
            // 
            this.MayorNota.Location = new System.Drawing.Point(402, 175);
            this.MayorNota.Name = "MayorNota";
            this.MayorNota.Size = new System.Drawing.Size(100, 23);
            this.MayorNota.TabIndex = 15;
            this.MayorNota.Text = "Mayor nota";
            this.MayorNota.UseVisualStyleBackColor = true;
            this.MayorNota.Click += new System.EventHandler(this.MayorNota_Click);
            // 
            // MenorNota
            // 
            this.MenorNota.Location = new System.Drawing.Point(402, 258);
            this.MenorNota.Name = "MenorNota";
            this.MenorNota.Size = new System.Drawing.Size(100, 23);
            this.MenorNota.TabIndex = 16;
            this.MenorNota.Text = "Menor nota";
            this.MenorNota.UseVisualStyleBackColor = true;
            this.MenorNota.Click += new System.EventHandler(this.MenorNota_Click);
            // 
            // labelNomMayor
            // 
            this.labelNomMayor.AutoSize = true;
            this.labelNomMayor.Location = new System.Drawing.Point(399, 210);
            this.labelNomMayor.Name = "labelNomMayor";
            this.labelNomMayor.Size = new System.Drawing.Size(42, 13);
            this.labelNomMayor.TabIndex = 17;
            this.labelNomMayor.Text = "Alumno";
            // 
            // labelNomMenor
            // 
            this.labelNomMenor.AutoSize = true;
            this.labelNomMenor.Location = new System.Drawing.Point(399, 294);
            this.labelNomMenor.Name = "labelNomMenor";
            this.labelNomMenor.Size = new System.Drawing.Size(42, 13);
            this.labelNomMenor.TabIndex = 18;
            this.labelNomMenor.Text = "Alumno";
            // 
            // labelNotaMayor
            // 
            this.labelNotaMayor.AutoSize = true;
            this.labelNotaMayor.Location = new System.Drawing.Point(399, 231);
            this.labelNotaMayor.Name = "labelNotaMayor";
            this.labelNotaMayor.Size = new System.Drawing.Size(30, 13);
            this.labelNotaMayor.TabIndex = 19;
            this.labelNotaMayor.Text = "Nota";
            // 
            // labelNotaMenor
            // 
            this.labelNotaMenor.AutoSize = true;
            this.labelNotaMenor.Location = new System.Drawing.Point(399, 317);
            this.labelNotaMenor.Name = "labelNotaMenor";
            this.labelNotaMenor.Size = new System.Drawing.Size(30, 13);
            this.labelNotaMenor.TabIndex = 20;
            this.labelNotaMenor.Text = "Nota";
            // 
            // button1
            // 
            this.button1.BackColor = System.Drawing.Color.Goldenrod;
            this.button1.ForeColor = System.Drawing.Color.Black;
            this.button1.Location = new System.Drawing.Point(576, 89);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(105, 51);
            this.button1.TabIndex = 21;
            this.button1.Text = "segunda parte del examen";
            this.button1.UseVisualStyleBackColor = false;
            this.button1.Click += new System.EventHandler(this.button1_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(703, 450);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.labelNotaMenor);
            this.Controls.Add(this.labelNotaMayor);
            this.Controls.Add(this.labelNomMenor);
            this.Controls.Add(this.labelNomMayor);
            this.Controls.Add(this.MenorNota);
            this.Controls.Add(this.MayorNota);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.PromAlumno);
            this.Controls.Add(this.listBoxProm);
            this.Controls.Add(this.labelParcial3);
            this.Controls.Add(this.labelParcial2);
            this.Controls.Add(this.labelParcial1);
            this.Controls.Add(this.Promparcial3);
            this.Controls.Add(this.Promparcial2);
            this.Controls.Add(this.Promparcial1);
            this.Controls.Add(this.listBoxNombres);
            this.Controls.Add(this.buttonNombres);
            this.Controls.Add(this.textBoxContenido);
            this.Controls.Add(this.buttonCargar);
            this.Controls.Add(this.listBoxResultado);
            this.Controls.Add(this.buttonArreglo);
            this.Name = "Form1";
            this.Text = "Cargar Archivo";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button buttonArreglo;
        private System.Windows.Forms.ListBox listBoxResultado;
        private System.Windows.Forms.Button buttonCargar;
        private System.Windows.Forms.TextBox textBoxContenido;
        private System.Windows.Forms.Button buttonNombres;
        private System.Windows.Forms.ListBox listBoxNombres;
        private System.Windows.Forms.Button Promparcial1;
        private System.Windows.Forms.Button Promparcial2;
        private System.Windows.Forms.Button Promparcial3;
        private System.Windows.Forms.Label labelParcial1;
        private System.Windows.Forms.Label labelParcial2;
        private System.Windows.Forms.Label labelParcial3;
        private System.Windows.Forms.ListBox listBoxProm;
        private System.Windows.Forms.Button PromAlumno;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Button MayorNota;
        private System.Windows.Forms.Button MenorNota;
        private System.Windows.Forms.Label labelNomMayor;
        private System.Windows.Forms.Label labelNomMenor;
        private System.Windows.Forms.Label labelNotaMayor;
        private System.Windows.Forms.Label labelNotaMenor;
        private System.Windows.Forms.Button button1;
    }
}

