<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="frmInicio.aspx.cs" Inherits="clase10bueno.frmInicio" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title></title>
</head>
<body style="height: 217px">
    <form id="form1" runat="server">
        <div>
        </div>
        <asp:Button ID="ButtonSubirInformacion" runat="server" Height="75px" OnClick="ButtonSubirInformacion_Click" Text="Cargar Info CSV SQL" Width="150px" />
        <asp:Button ID="ButtonSubirInformacionMySQL" runat="server" Height="72px" OnClick="ButtonSubirInformacionMySQL_Click" style="margin-bottom: 0px" Text="Cargar INFO MYSQL" Width="139px" />
    </form>
</body>
</html>
