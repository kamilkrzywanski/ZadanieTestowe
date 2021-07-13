<!DOCTYPE html>
<%@ include file="base.jsp" %>
 <%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>


<html>
    <script src="/js/getrequest.js"></script>
     <script src="/js/postrequest.js"></script>
    <head>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <title>Strona główna</title>
    </head>
    <body>

    <c:if test="${not empty elementy}">
    <table id="myTable" class="table table-striped align-middle table-sm">
        <thead class="thead-dark">
            <tr>

                <th scope="col">id</th>
                <th scope="col">Kolumna1</th>
                <th scope="col">Kolumna2</th>
                <th scope="col">Kolumna3</th>
                <th scope="col">Kolumna4</th>
            </tr>
        </thead>
        <tbody>

                <c:forEach items="${elementy}" var="ele">
                    <tr>
                        <td>${ele.id}</td>
                        <td>${ele.kolumna1}</td>
                        <td>${ele.kolumna2}</td>
                        <td>${ele.kolumna3}</td>
                        <td>${ele.kolumna4}</td>

                    </tr>
                </c:forEach>
         </tbody>
    </table>
    </c:if>
<div class="row">
    <div class="col-12 col-md-6 mt-3">
        <br>

        <label for="kolumna">Wybierz kolumnę</label>
         <select id="kolumna" class="form-control" onchange="ChangeKolumna()">
                    <option value=1>Kolumna 1</option>
                    <option value=2>Kolumna 2</option>
                    <option value=3>Kolumna 3</option>
                    <option value=4>Kolumna 4</option>
               </select>

        <br>
        <a id="btn" class="btn btn-info" value="0" href="/selKolumnaDub/1" >Unikalne wiersze dla kolumny</a>
        <a id="btn2" class="btn btn-info" value="0" href="/selKolumnaUni/1" >Zdublowane wiersze</a>
    </div>

    <div class="col-sm-7" style="margin:20px 0px 20px 0px">
    		<button id="getUni" type="button" class="btn btn-primary">Pobierz unikalne Ajax</button>
    		<button id="getDub" type="button" class="btn btn-primary">Pobierz zdublowane Ajax</button>
    		<div id="getResultDiv" style="padding:20px 10px 20px 50px">
    	        <ul class="list-group">
    	    	</ul>
        	</div>
    	</div>

    </body>
</html>

<script>

        function ChangeKolumna() {
                document.getElementById("btn").href = "/selKolumnaUni/"+document.getElementById("kolumna").value;
                document.getElementById("btn2").href = "/selKolumnaDub/"+document.getElementById("kolumna").value;
        }
        </script>


