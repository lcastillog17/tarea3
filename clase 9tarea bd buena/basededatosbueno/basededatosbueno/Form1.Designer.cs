
namespace basededatosbueno
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
            this.btnSql = new System.Windows.Forms.Button();
            this.btnMysql = new System.Windows.Forms.Button();
            this.btnOracle = new System.Windows.Forms.Button();
            this.listBox1 = new System.Windows.Forms.ListBox();
            this.listBox2 = new System.Windows.Forms.ListBox();
            this.listBox3 = new System.Windows.Forms.ListBox();
            this.SuspendLayout();
            // 
            // btnSql
            // 
            this.btnSql.BackColor = System.Drawing.Color.Tan;
            this.btnSql.Location = new System.Drawing.Point(32, 28);
            this.btnSql.Name = "btnSql";
            this.btnSql.Size = new System.Drawing.Size(125, 54);
            this.btnSql.TabIndex = 0;
            this.btnSql.Text = "SQL Server";
            this.btnSql.UseVisualStyleBackColor = false;
            this.btnSql.Click += new System.EventHandler(this.btnSql_Click);
            // 
            // btnMysql
            // 
            this.btnMysql.BackColor = System.Drawing.Color.Tan;
            this.btnMysql.Location = new System.Drawing.Point(427, 28);
            this.btnMysql.Name = "btnMysql";
            this.btnMysql.Size = new System.Drawing.Size(125, 54);
            this.btnMysql.TabIndex = 1;
            this.btnMysql.Text = "My SQL";
            this.btnMysql.UseVisualStyleBackColor = false;
            this.btnMysql.Click += new System.EventHandler(this.btnMysql_Click);
            // 
            // btnOracle
            // 
            this.btnOracle.BackColor = System.Drawing.Color.Tan;
            this.btnOracle.Location = new System.Drawing.Point(278, 209);
            this.btnOracle.Name = "btnOracle";
            this.btnOracle.Size = new System.Drawing.Size(125, 54);
            this.btnOracle.TabIndex = 2;
            this.btnOracle.Text = "Oracle";
            this.btnOracle.UseVisualStyleBackColor = false;
            this.btnOracle.Click += new System.EventHandler(this.btnOracle_Click);
            // 
            // listBox1
            // 
            this.listBox1.FormattingEnabled = true;
            this.listBox1.Location = new System.Drawing.Point(17, 102);
            this.listBox1.Name = "listBox1";
            this.listBox1.Size = new System.Drawing.Size(306, 95);
            this.listBox1.TabIndex = 3;
            // 
            // listBox2
            // 
            this.listBox2.FormattingEnabled = true;
            this.listBox2.Location = new System.Drawing.Point(412, 102);
            this.listBox2.Name = "listBox2";
            this.listBox2.Size = new System.Drawing.Size(306, 95);
            this.listBox2.TabIndex = 4;
            // 
            // listBox3
            // 
            this.listBox3.FormattingEnabled = true;
            this.listBox3.Location = new System.Drawing.Point(263, 269);
            this.listBox3.Name = "listBox3";
            this.listBox3.Size = new System.Drawing.Size(306, 95);
            this.listBox3.TabIndex = 5;
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.SystemColors.ControlDarkDark;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.listBox3);
            this.Controls.Add(this.listBox2);
            this.Controls.Add(this.listBox1);
            this.Controls.Add(this.btnOracle);
            this.Controls.Add(this.btnMysql);
            this.Controls.Add(this.btnSql);
            this.Name = "Form1";
            this.Text = "Form1";
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Button btnSql;
        private System.Windows.Forms.Button btnMysql;
        private System.Windows.Forms.Button btnOracle;
        private System.Windows.Forms.ListBox listBox1;
        private System.Windows.Forms.ListBox listBox2;
        private System.Windows.Forms.ListBox listBox3;
    }
}

