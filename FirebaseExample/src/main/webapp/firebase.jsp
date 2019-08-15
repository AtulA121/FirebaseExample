<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<body onload="firebaseExample()">
	
	<script src="https://www.gstatic.com/firebasejs/3.6.3/firebase.js"></script>
	<script>
	
		function firebaseExample()
		{
		//	alert("Done :");
			var config = {
				    apiKey: "AIzaSyAgNgBDmGJyKr6voT5acRMLkvmtZSXiooY",
				    authDomain: "fir-example2-3e85a.firebaseapp.com",
				    databaseURL: "https://fir-example2-3e85a.firebaseio.com/",
				    projectId: "fir-example2-3e85a",
				    storageBucket: "fir-example2-3e85a.appspot.com",
				    messagingSenderId: "696110835080",
				  };
				  firebase.initializeApp(config);
				  console.log(firebase);
				  
				  var database=firebase.database();
				  var ref=database.ref("Matches");
				  
				  var ref2=database.ref("Match");
				  ref2.push("atulpisal.ap@gmail.com");
				  console.log("Inserted successfully : String");
				  
				  var data={
						  name : "atul",
						  address : "jawala"
				  }
				  
				  ref.push(data);
				  console.log("Inserted successfully : Json");
				  
				  var ref2=database.ref("scores");
				  ref.on("value",getData,errorData);
		}
		
		function getData(data)
		{
			var scoress=data.val();
			var keyss=Object.keys(scoress);
			
			
			for(var i=0;i<keyss.length;i++)
			{
				var k=keyss[i];
				var name=scoress[k].name;
				var address=scoress[k].address;
				console.log(name,address);
				var str=str+" "+name+" "+address+"<br>";
			}
			document.getElementById("data").innerHTML = str;
		//	alert("Sated ");
		}
		
		function errorData(error)
		{
			console.log("Error :");
			console.log(error);
		}
		
	</script>
	
	<form action="sendData" method="get">
		<input type="submit" />
	</form>
	
	<div id="data"></div>
	
</body>
</html>