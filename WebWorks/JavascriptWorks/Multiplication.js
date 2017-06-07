<html>
    <head>
        <script type="text/javascript">
       function funMul(){
           //by default prompt will return the String value
           //to as integer we have to do parseInt
           val=0;
           var i = 0;
           val = parseInt(prompt("Enter Number ","0"));
           document.write("<table>")
           for(i=1;i<=10;i++){
               document.write("<tr><td>" + val + "x" + i + "=" + val*i + "</tr></td>")
           }
           document.write("</table>")                 

              }
        </script>

    </head>

    <body>
        <input type="button" onclick="funMul()" value="Multiplication of table"/>
       
           </body>

</html>