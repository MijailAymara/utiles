<%-- 
    Document   : index
    Created on : 29/10/2013, 10:49:37 PM
    Author     : Aurora
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Volumén de una esfera</h1>
        <form name="frmVolumen" action="index.jsp" method="POST">
            Radio: <input type="text" name="txtRadio" value="0" size="10" />
            <input type="submit" value="Calcular Volumén" name="btnVolumen" />
        </form>
            <%-- start web service invocation --%><hr/>
    <%
        double radio = 0.0d;
        try{ 
            esfera.VolumenEsfera_Service service = new esfera.VolumenEsfera_Service();
            esfera.VolumenEsfera port = service.getVolumenEsferaPort();
            // TODO initialize WS operation arguments here
            radio = Double.valueOf(request.getParameter("txtRadio"));
            // TODO process result here
            double result = port.calcularVolumenEsfera(radio);
            out.println("Volumén = "+result);
        }catch(NumberFormatException nfe)
        {
           out.println("Radio incorrecto");
        }catch(Exception ex)
        {
           out.println("");
        }

    %>
    <%-- end web service invocation --%><hr/>

    </body>
</html>
