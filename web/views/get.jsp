<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Get user by name</title>
    <link rel="stylesheet" href="styles/w3.css">
</head>

<body class="w3-light-grey">
<div class="w3-container w3-blue-grey w3-opacity w3-right-align">
    <h1>Here you can get a user by name</h1>
</div>

<div class="w3-container w3-center w3-margin-bottom w3-padding">
    <div class="w3-card-4">
        <div class="w3-card-4">
            <div class="w3-container w-3 center w3-green">
                <h2>Get user</h2>
            </div>

            <form method="post" class="w3-selection w3-light-grey w3-padding">
                <label>Name:
                    <input type="text" name="name" class="w3-input w3-animate-input w3-border w3-round-large" style="width: 30%"><br />
                </label>
                <button type="submit" class="w3-btn w3-green w3-round-large w3-margin-bottom">Get a user</button>
            </form>
        </div>

        <div class="w3-container w3-light-blue">
            <h2>User</h2>
        </div>
        <%--        <%--%>
        <%--            String name = (String) request.getAttribute("name");--%>

        <%--            if (name != null && !name.isEmpty()) {--%>
        <%--                out.println("<ul class=\"w3-ul\">");--%>
        <%--                for (String s : name) {--%>
        <%--                    out.println("<li class=\"w3-hover-sand\">" + s + "</li>");--%>
        <%--                }--%>
        <%--                out.println("</ul>");--%>

        <%--            } else out.println("<div class=\"w3-panel w3-red w3-display-container w3-card-4 w3-round\">\n"--%>
        <%--                    +--%>
        <%--                    "   <span onclick=\"this.parentElement.style.display='none'\"\n" +--%>
        <%--                    "   class=\"w3-button w3-margin-right w3-display-right w3-round-large w3-hover-red w3-border w3-border-red w3-hover-border-grey\">×</span>\n" +--%>
        <%--                    "   <h5>There are no users yet!</h5>\n" +--%>
        <%--                    "</div>");--%>
        <%--        %>--%>
    </div>
</div>

<div class="w3-container w3-grey w3-opacity w3-right-align w3-padding">
    <button class="w3-btn w3-round-large" onclick="location.href='/'">Back to main</button>
</div>
</body>
</html>