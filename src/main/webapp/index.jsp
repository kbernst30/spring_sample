<html>
    <head>
        <meta http-equiv="content-type" content="text/html; charset=ISO-8859-1">
    </head>
    <body>
    <meta charset="utf-8">
    <title>Your First WebSocket!</title>
        <script language="javascript" type="text/javascript">

            var wsUri = "ws://localhost:8080/notifications";

            function webSocketTest() {
                var output = document.getElementById("output");
                var websocket = new WebSocket(wsUri);
                websocket.onopen = function(evt) {
                    console.log("Connection Opened");
                };
                websocket.onmessage = function(evt) {
                    console.log("MSG: " + evt.data);
                };
                websocket.onerror = function(evt) {
                    console.log("ERROR");
                };
                websocket.onclose = function(evt) {
                    console.log("CLOSED");
                }
            }
        </script>

        <button onclick="webSocketTest()">Test</button>
        <div id="output"></div>
    </body>
</html>