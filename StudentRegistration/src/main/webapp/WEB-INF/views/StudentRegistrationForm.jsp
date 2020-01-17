<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
/* Popup container - can be anything you want */
.popup {
  position: relative;
  display: inline-block;
  cursor: pointer;
  -webkit-user-select: none;
  -moz-user-select: none;
  -ms-user-select: none;
  user-select: none;
}
/* The actual popup */
.popup .popuptext {
  visibility: hidden;
  width: 600px;
  background-color: #555;
  color: #fff;
  text-align: center;
  border-radius: 6px;
  padding: 8px 0;
  position: absolute;
  z-index: 1;
  bottom: 125%;
  left: 50%;
  margin-left: -80px;
}
/* Popup arrow */
.popup .popuptext::after {
  content: "";
  position: absolute;
  top: 100%;
  left: 50%;
  margin-left: -5px;
  border-width: 5px;
  border-style: solid;
  border-color: #555 transparent transparent transparent;
}
/* Toggle this class - hide and show the popup */
.popup .show {
  visibility: visible;
  -webkit-animation: fadeIn 1s;
  animation: fadeIn 1s;
}
/* Add animation (fade in the popup) */
@-webkit-keyframes fadeIn {
  from {opacity: 0;} 
  to {opacity: 1;}
}
@keyframes fadeIn {
  from {opacity: 0;}
  to {opacity:1 ;}
}
</style>
<script>
		function validate(){
		if (document.myForm.student_Name.value==""){
			alert("Please Enter Your Name!!");
			document.myForm.student_Name.focus();
			return false;
			}
		if (!/^[a-zA-Z]/.test(document.myForm.student_Name.value)){
			alert("ERROR CODE 501:Invalid Student Name");
			document.myForm.student_Name.focus();
			return false;
			}
		if (document.myForm.date_Of_Birth.value==""){
			alert("Please Enter Date of Birth!!");
			document.myForm.date_Of_Birth.focus();
			return false;
			}
		if (document.myForm.guardian_Type.value==""){
			alert("Please Select as Appropriate!!");
			document.myForm.guardian_Type.focus();
			return false;
			}
		if (document.myForm.guardian_Name.value==""){
			alert("Please Enter Guardian Name!!");
			document.myForm.guardian_Name.focus();
			return false;
			}
		if (document.myForm.country_Name.value==""){
			alert("Please Select as Appropriate!!");
			document.myForm.country_Name.focus();
			return false;
			}
		if (document.myForm.state_Name.value==""){
			alert("Please Select as Appropriate!!");
			document.myForm.state_Name.focus();
			return false;
			}
		if (document.myForm.address.value==""){
			alert("Please Enter Your Address!!");
			document.myForm.address.focus();
			return false;
			}
		if (document.myForm.contact_No.value==""){
			alert("Please Enter contact Number!!");
			document.myForm.contact_No.focus();
			return false;
			}
		if (document.myForm.contact_No.length!=10){
			alert("ERROR CODE 506:Invalid Contact No");
			document.myForm.contact_No.focus();
			return false;
			}
		if (document.myForm.mail_ID.value==""){
			alert("Please Enter Your Email!!");
			document.myForm.mail_ID.focus();
			return false;
			}
		if (document.myForm.date_Of_Joining.value==""){
			alert("Please Enter Date of Joining!!");
			document.myForm.date_Of_Joining.focus();
			return false;
			}
		if (document.myForm.gender.value==""){
			alert("Please Select as Appropriate!!");
			document.myForm.gender.focus();
			return false;
			}
		if (document.myForm.standard.value==""){
			alert("Please Select as Appropriate!!");
			document.myForm.standard.focus();
			return false;
			}
		if (document.myForm.transport.value==""){
			alert("Please Select your Transport Preference!!");
			document.myForm.transport.focus();
			return false;
			}
			return true;
		}
	</script>
	<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
			<script type="text/javascript">
				$(document).ready(function(){
					$("h1").css("background-color","pink");
					});
			</script>
</head>
<body>
		<h1 align="center">Register Student</h1>
		<form action="addstudent" method="post" name="myForm"  onsubmit="return(validate())">
			<table cellpadding="2" cellspacing="2" align="center">
				<tr>
					<td>NAME<font color="red">*</font></td><td>:</td>
					<td><input type="text" name="student_Name"></td>
				</tr>
				<tr>
					<td>DATE OF BIRTH<font color="red">*</font></td><td>:</td>
					<td><input type="date" name="date_Of_Birth"></td>
				</tr>
				<tr>
					<td>GUARDIAN TYPE<font color="red">*</font></td><td>:</td>
					<td><input type="radio" name="guardian_Type" value="G">GUARDIAN
					   <input type="radio" name="guardian_Type" value="P">PARENT <br></td>
				</tr>
				<tr>
					<td>GUARDIAN NAME<font color="red">*</font></td><td>:</td>
					<td><input type="text" name="guardian_Name"></td>
				</tr>
				<tr>
					<td>COUNTRY<font color="red">*</font></td><td>:</td>
					<td><input list ="country_Name" name="country_Name">
						<datalist id="country_Name">
							<option value="India">India</option> 
							<option  value="UK">UK</option>
							<option  value="USA">USA</option>
							<option value="Italy">Italy</option> 
						</datalist>
					</td>
				</tr>
				<tr>
					<td>STATE<font color="red">*</font></td><td>:</td>
					<td><input list ="state_Name" name="state_Name">
						<datalist id="state_Name">
							<option value="TamilNadu">TamilNadu</option> 
							<option  value="Kerala">Kerala</option>
							<option  value="Karnataka">Karnataka</option>
							<option value="Andhra Pradesh">Andhra Pradesh</option> 
							<option  value="Scotland">Scotland</option>
							<option  value="New Jersey">New Jersey</option>
							<option value="Rome">Rome</option> 
						</datalist>
					</td>
				</tr>
				<tr>
					<td>ADDRESS<font color="red">*</font></td><td>:</td>
					<td><input type="text" name="address"></td>
				</tr>
				<tr>
					<td>CONTACT NUMBER<font color="red">*</font></td><td>:</td>
					<td><input type="number" name="contact_No"></td>
				</tr>
				<tr>
					<td>EMAIL ADDRESS<font color="red">*</font></td><td>:</td>
					<td><input type="Email" name="mail_ID" ></td>
				</tr>
				<tr>
					<td>DATE OF JOINING<font color="red">*</font></td><td>:</td>
					<td><input type="date" name="date_Of_Joining"></td>
				</tr>
				
				<tr>
					<td>GENDER<font color="red">*</font></td><td>:</td>
					<td><input type="radio" name="gender" value="F">FEMALE
					   <input type="radio" name="gender" value="M">MALE</td>
				</tr>
				<tr>
					<td>STANDARD<font color="red">*</font></td><td>:</td>
					<td><input list ="standard" name="standard"><br>
							<datalist id="standard">
								<option value="I">STANDARD I</option> 
								<option  value="II">STANDARD II</option>
								<option  value="III">STANDARD III</option>
								<option value="IV">STANDARD IV</option> 
								<option  value="V">STANDARD V</option>
								<option  value="VI">STANDARD VI</option>
								<option value="VII">STANDARD VII</option> 
								<option  value="VIII">STANDARD VIII</option>
								<option  value="IX">STANDARD IX</option>
								<option value="X">STANDARD X</option> 
								<option  value="XI">STANDARD XI</option>
								<option  value="XII">STANDARD XII</option>
							</datalist>
					</td>
				</tr>
				<tr>
					<td>TRANSPORTATION<font color="red">*</font></td><td>:</td>
					<td><input type="radio" name="transport" value="Y">YES
					   <input type="radio" name="transport" value="N">NO</td>
				</tr>
				<tr>
					<td>FEE VIEWER</td><td> </td>
					<td>
						<div class="popup" onclick="feeViewer()">Click Here!
  							<span class="popuptext" id="myPopup"> 
  								<table>
  									<caption>FEE STRUCTURE</caption>
									<tr>
										<th>STANDARD</th>
										<th>FEE WITH TRANSPORTATION</th>
										<th>FEE WITHOUT TRANSPORTATION</th>
									</tr>
									<tr><td>I</td><td>18000</td><td>19200</td></tr>
									<tr><td>II</td><td>20000</td><td>21200</td></tr>
									<tr><td>III</td><td>22000</td><td>23200</td></tr>
									<tr><td>IV</td><td>24000</td><td>25200</td></tr>
									<tr><td>V</td><td>26000</td><td>27200</td></tr>
									<tr><td>VI</td><td>28000</td><td>29200</td></tr>
									<tr><td>VII</td><td>30000</td><td>31200</td></tr>
									<tr><td>VIII</td><td>32000</td><td>33200</td></tr>
									<tr><td>IX</td><td>34000</td><td>35200</td></tr>
									<tr><td>X</td><td>40000</td><td>41200</td></tr>
									<tr><td>XI</td><td>45000</td><td>46200</td></tr>
									<tr><td>XII</td><td>50000</td><td>51200</td></tr>
  								</table>
							</span>
						</div>
					</td>
				</tr>
				
				<tr>
					<td>&nbsp;</td><td> </td>
					<td><input type="submit" value="SUBMIT">
						<a href="StudentRegistrationForm.jsp"><button type="button">RESET</button></a>
					</td>
				</tr>
			</table>
		</form>
		<script>
			// When the user clicks on div, the popup opens
			function feeViewer() {
		 	 var popup = document.getElementById("myPopup");
			  popup.classList.toggle("show");
			}		
		</script>
</body>
</html>
