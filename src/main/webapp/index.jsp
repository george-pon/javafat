<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>javafat - heap memory eater</title>
</head>
<body>
	<h1>javafat - heap memory eater</h1>

	<form method="post" action="mps">
		<table>
			<tr>
				<td>memory use (Mega bytes) per page view :</td>
				<td><input type="text" id="mps-text-input" name="mps" /></td>
			</tr>
			<tr>
				<td>cpu use ( second ) per page view :</td>
				<td><input type="text" id="cps-text-input" name="cps" /></td>
			</tr>
			<tr>
				<td colspan=2><input type="submit" id="mps-button"
					value="Submit" /></td>
			</tr>
		</table>
	</form>
</body>
</html>

