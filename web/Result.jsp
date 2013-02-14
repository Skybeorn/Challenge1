<%-- 
    Document   : index
    Created on : Feb 14, 2013, 11:47:52 AM
    Author     : Skybeorn
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE <html></html>
<html>
    <head>
        <title>Calculator</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript">
            function validateForm()
            {
                var radius = document.forms["two"]["radius"].value;
                if (radius == null || radius == "")
                {
                    alert("Must Enter A Value");
                    return false;
                }
        </script>
    </head>
    <body align="center">
        <form id="one" name="one" method="POST" 
              action="FrontServletController?action=RectangleInput">
            <table border="1" width="230">
                <tr>
                    <td align="center"  >
                        <p>Rectangular Area </p>
                    </td>
                </tr>
                <tr>
                    <td align="center">            
                        <%
                            Object rectangleAnswer = request.getAttribute("rectangleArea");
                            String rectangleArea = "";
                            if (rectangleAnswer != null) {
                                rectangleArea = rectangleAnswer.toString();
                                out.print("Answer: " + rectangleArea);
                            }
                        %>
                    </td>
                </tr>
            </table>
            <hr width="230" align="left">
        </form>

        <form id="two" name="two" method="POST" onsubmit="return validateForm()"
              action="FrontServletController?action=CircleInput">
            <table border="1" width="230">
                <tr>
                    <td align="center">
                        <p>Circle Area </p>
                    </td>
                </tr>
                <tr>
                    <td align="center">            
                        <%
                            Object circleResult = request.getAttribute("circleArea");
                            String circleArea = "";
                            if (circleResult != null) {
                                circleArea = circleResult.toString();
                                out.print("Answer: " + circleArea);
                            }
                        %>
                    </td>
                </tr>
            </table>
            <hr width="230" align="left">
        </form>

        <form id="three" name="three" method="POST" 
              action="FrontServletController?action=TriangleInput"> 

            <table border="1" width="230">
                <tr>
                    <td align="center">
                        <p>Hypotenuse</p>
                    </td>            
                        <%
                            Object hypotenuseResult = request.getAttribute("hypotenuse");
                            String hypotenuse = "";
                            if (hypotenuseResult != null) {
                                hypotenuse = hypotenuseResult.toString();
                                out.print("Answer: " + hypotenuse);
                            }
                        %>
                    </td>
                </tr>
            </table>
            <hr width="230" align="left">
        </form>
    </body>
</html>
